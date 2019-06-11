package WorkingWithpom;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser {
	public Menu menu=null;
	public AddUser(WebDriver driver){
		menu=PageFactory.initElements(driver, Menu.class);
	}
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pim;
	@FindBy(id="menu_pim_addEmployee")
	WebElement AddEmp;
	@FindBy(id="firstName")
	WebElement fname;
	@FindBy(id="middleName")
	WebElement mname;
	@FindBy(id="lastName")
	WebElement lname;
	@FindBy(id="employeeId")
	WebElement EMPID;
	@FindBy(id="btnSave")
	WebElement save;
	public void AddingUser(String f,String m,String l,String EI)
	{
		pim.click();
		AddEmp.click();
		Sleeper.sleepTightInSeconds(10);
		fname.sendKeys(f);
		mname.sendKeys(m);
		lname.sendKeys(l);
		EMPID.sendKeys(EI);
		save.click();
		
		}
	}
