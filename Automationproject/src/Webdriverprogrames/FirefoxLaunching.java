package Webdriverprogrames;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirefoxLaunching {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver","‪C:\\Users\\Public\\Desktop\\Google Chrome.lnk");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		}

}
