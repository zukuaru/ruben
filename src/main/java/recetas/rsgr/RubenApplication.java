package recetas.rsgr;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@SpringBootApplication
public class RubenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RubenApplication.class, args);


        try{
            // Use a file

           // NPOIFSFileSystem fs = new NPOIFSFileSystem(new File("C:\\Users\\zukua\\Documents\\uno.xlsx"));


            Workbook wb = WorkbookFactory.create(new FileInputStream("C:\\Users\\zukua\\Documents\\uno.xlsx"));


         Sheet s1= wb.getSheetAt(0);
         Row r1= s1.getRow(0);
   System.out.println("Bien");

        }catch(Exception e){
System.out.println("mal "+e.getMessage());
        }
	}
}
