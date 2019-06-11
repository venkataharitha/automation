package WorkingWithCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLoginbyCss {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void data(){
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("mercury");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mercury123");
		driver.findElement(By.cssSelector("input[name='login']")).click();
		
	}

}
