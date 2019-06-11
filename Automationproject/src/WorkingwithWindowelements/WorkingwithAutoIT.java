package WorkingwithWindowelements;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingwithAutoIT {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("hari");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.hdnicewallpapers.com/Wallpaper-Download/Cute-Baby/Cute-Baby-4K-Wallpaper");
	}
	
	@Test
	public void data() throws InterruptedException, IOException{
		driver.findElement(By.xpath("//*[@id='DL']/div")).click();
		Thread.sleep(5000);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\harit_000\\Desktop\\prog1.exe");
	}
}
