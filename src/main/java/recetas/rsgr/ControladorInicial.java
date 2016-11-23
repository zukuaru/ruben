package recetas.rsgr;

import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by zukua on 28/10/2016.
 */
@RestController
public class ControladorInicial {

    @RequestMapping("/hola")
    public String hola(){
        return "segunda pureba";
    }



    @CrossOrigin
    @RequestMapping(value="/cargar-mongo1", method= RequestMethod.POST, headers={"Accept=text/html"})
    public @ResponseBody
    String handleFileUpload(@RequestParam("file") MultipartFile file)throws Exception{
        String nombre=file.getOriginalFilename();
        String prefijo="";
        DateTime date=new DateTime();
        ;
        int dia=  date.getDayOfYear();
        int segundo=  date.getSecondOfDay();
        long tamano= file.getSize();
        String fileName = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        if (file.getSize() > 0) {
            inputStream = file.getInputStream();


            String contenido=  file.getContentType();
            int punto=nombre.indexOf(".");
            String nombreSolo=nombre.substring(0, punto);
            prefijo="dia"+dia+"segundo"+segundo;
            //   System.out.println("nombre de archivo:"+fileName);
            //Guardamos imagen, si es que hay
            // gridFsTemplate.store(inputStream,prefijo+nombre,file.getContentType());
            //Lo impresionante aqui es que el repositorio tambien tiene la opcion para
            //guardar un archivo!!!
            // grid.store(inputStream,prefijo+nombre,file.getContentType());
        }
        System.out.println("El nombre de archivaldo es:" + nombre + " el tamaño del archivo esta:" + tamano + " se guardo como: " + prefijo + nombre);

        return  prefijo+nombre;

    }

}
