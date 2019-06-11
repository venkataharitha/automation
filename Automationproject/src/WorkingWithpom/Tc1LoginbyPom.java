package WorkingWithpom;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;

public class Tc1LoginbyPom {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//verify login
		HrmLogin page1=PageFactory.initElements(driver, HrmLogin.class);
		AddUser page2=PageFactory.initElements(driver, AddUser.class);
		HrmLogout page3=PageFactory.initElements(driver, HrmLogout.class);
		page1.login("admin", "admin123");
		Sleeper.sleepTightInSeconds(5);
		page2.AddingUser("qa123", "qa", "tester", "001");
		Sleeper.sleepTightInSeconds(5);
		page3.logout();

	}

}
