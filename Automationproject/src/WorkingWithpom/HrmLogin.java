package WorkingWithpom;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrmLogin {
	public Menu menu=null;
	public HrmLogin(WebDriver driver){
		menu=PageFactory.initElements(driver, Menu.class);
	}
	@FindBy(id="txtUsername")
	WebElement user;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement ok;
	public void login(String u,String p){
		user.clear();
		user.sendKeys(u);
		password.clear();
		password.sendKeys(p);
		ok.click();
		
		}
	}
