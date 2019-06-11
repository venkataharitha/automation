package WorkingWithApachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExampleApachepoi {

	public static void main(String[] args) throws IOException {
			  FileInputStream fso=new FileInputStream("C:\\Users\\harit_000\\Desktop\\Book1.xlsx");
			 XSSFWorkbook wbo = new XSSFWorkbook(fso);
			  XSSFSheet wso=wbo.getSheet("sheet1");
			  Row r;
			  r=wso.createRow(0);
			  r.createCell(0).setCellValue("anusha");
			  System.out.println("succ inserted");
			 //
	      FileOutputStream fo=new FileOutputStream("C:\\Users\\harit_000\\Desktop\\Book1.xlsx");
	      wbo.write(fo);
	}
	
	
}

	
