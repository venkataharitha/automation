package WorkingWebdriverWithApachepoi;

import java.io.FileInputStream;
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

public class ExampleWebdriverWithApachepoi {
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
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	   public void data() throws IOException{
		fso=new FileInputStream("‪‪F:\\h1.xlsx");
		wbo=new XSSFWorkbook(fso);
		wso=wbo.getSheet("sheet1");
		Row r;
		String name=driver.findElement(By.linkText("Gmail")).getText();
		r=wso.createRow(0);
	    r.createCell(0).setCellValue(name);
	    FileOutputStream fo=new FileOutputStream("‪F:\\h1.xlsx");
	    wbo.write(fo);
	    
	}
}