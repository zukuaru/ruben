package recetas.rsgr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zukua on 28/10/2016.
 */
@RestController
public class ControladorInicial {

    @RequestMapping("/hola")
    public String hola(){
        return "segunda pureba";
    }

}
