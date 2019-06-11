package WorkingWithDatadrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example1Dtadriven {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	FileInputStream fso;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("hari");
		driver=new FirefoxDriver(fp);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test
	public void data() throws IOException{
		fso=new FileInputStream("F:\\sample.xlsx");
		wbo=new XSSFWorkbook(fso);
		wso=wbo.getSheet("sheet1");
		Row r;
		int rowc=wso.getLastRowNum();
		for(int i=1;i<rowc;i++){
			r=wso.getRow(i);
			driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.id("btnLogin")).click();
			String actual=driver.getCurrentUrl();
			r.createCell(3).setCellValue(actual);
			String expected=r.getCell(2).getStringCellValue();
			if(expected.equals(actual)){
				r.createCell(4).setCellValue("pass");
			}
			else
			{
				r.createCell(4).setCellValue("fail");
			}
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}
		FileOutputStream fo=new FileOutputStream("F:\\sample.xlsx");
		wbo.write(fo);
	}
	
}
