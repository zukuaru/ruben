package recetas.rsgr;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

@SpringBootApplication
public class RubenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RubenApplication.class, args);


        try{
            FileInputStream fileIn = null;
            FileOutputStream fileOut = null;




               fileIn = new FileInputStream("/home/campitos/uno.xlsx");
           // OPCPackage pkg = OPCPackage.open("C:\\Users\\zukua\\Documents\\uno.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(fileIn);
           // XSSFWorkbook wb = new XSSFWorkbook(fileIn);
            XSSFSheet sheet = wb.getSheetAt(0);
            XSSFRow row = sheet.getRow(5);
            XSSFCell celda= row.getCell(1);
          String valor=  celda.getStringCellValue();


                System.out.println("Bien   "+valor);

        }catch(Exception e){
System.out.println("mal "+e.getMessage());
        }
	}
}
