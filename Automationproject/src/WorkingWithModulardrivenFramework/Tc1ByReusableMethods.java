package WorkingWithModulardrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Tc1ByReusableMethods {
	ReusableMethods obj1;
	FirefoxDriver driver;
	@Test
	public void tc1(){
		obj1=new ReusableMethods();
		obj1.open();
		obj1.login("admin", "admin123");
		obj1.checklogin();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("firstName")).sendKeys("venkata");
	    driver.findElement(By.id("middleName")).sendKeys("anusha");
	    driver.findElement(By.id("lastName")).sendKeys("kakarlapudi");
	    driver.findElement(By.id("employeeId")).sendKeys("0027");
	    driver.findElement(By.id("btnSave")).click();
	    obj1.logout();
	    obj1.close();
		
	}
	

}
