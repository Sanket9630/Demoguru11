package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
        WebDriver driver;
	
	@FindBy(xpath = "//input[@name='uid']")
	    WebElement userid;
	
	@FindBy(xpath="//input[@name='password']")
	    WebElement Password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	    WebElement login;
	
	public LogInPage(WebDriver driver) {
	   PageFactory.initElements(driver,this);
	}

	public void sendUserName(String username) {

		userid.sendKeys(username);
	}
	
	public void sendPassword(String password) {
	  Password.sendKeys(password);
	}
  
	public void Clicklogin() {
         login.click();
	}
}
