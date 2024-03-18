package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageFactory {
	
	WebDriver driver;
	
	@FindBy(id = "x-auto-11")
	WebElement identifier;
	
	@FindBy(id = "x-auto-12")
	WebElement password;
	
	@FindBy(css = "#x-auto-10 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")
	WebElement btnValidation;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterId(String id) {
		identifier.sendKeys(id);
	}
	
	public void enterPassword(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void clickOnBtnValidation() {
		btnValidation.click();
	}
	
	
}
