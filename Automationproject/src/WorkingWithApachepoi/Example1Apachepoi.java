package WorkingWithApachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example1Apachepoi {

	public static void main(String[] args) throws IOException {
		  FileInputStream fso=new FileInputStream("C:\\Users\\harit_000\\Desktop\\Book1.xlsx");
			 XSSFWorkbook wbo = new XSSFWorkbook(fso);
			  XSSFSheet wso=wbo.getSheet("sheet2");
			  Row r;
		for(int i=0;i<10;i++){
			r=wso.createRow(i);
			r.createCell(0).setCellValue("police");
		}
		System.out.println("succ inserted");
		FileOutputStream fo=new FileOutputStream("‪C:\\Users\\harit_000\\Desktop\\Book1.xlsx");
		wbo.write(fo);
			
		}
}
		
		

