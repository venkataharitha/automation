package WorkingWithModulardrivenFramework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReusableMethods {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void login(String u, String p){
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(5);
	}
		@Test(priority=1)
		public void checklogin(){
			String expected="Welcome Admin";
			String actual=driver.findElement(By.linkText("Welcome Admin")).getText();
			Assert.assertEquals( expected,actual);
		}
		@Test(priority=2)
		public void logout(){
			driver.findElement(By.linkText("Welcome Admin")).click();
            driver.findElement(By.linkText("Logout")).click();
		}
		@AfterTest
		public void close(){
			driver.close();
		}
	}
