package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoutonsNavigation {
	
	WebDriver driver;
	
	public BoutonsNavigation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "btnAdministration")
	WebElement btnAdministration;
	
	@FindBy(id = "btnAutresCreations")
	WebElement btnCreationsDiverses;
	
	@FindBy(id = "btnCreateProvider")
	WebElement btnCreationFournisseurs;
	
	@FindBy(id = "btnGestionNomenclatures")
	WebElement btnGestionDesNomenclatures;
	
	@FindBy(id = "btnCreateAccountIntern")
	WebElement btnCompteDeGestion;
	
	@FindBy(css = "#x-auto-71 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")
	WebElement btnLogout;
	
	
				/** Boites de dialogue **/

	@FindBy(css = ".x-window-plain.x-window.x-window-dlg .x-toolbar-left-row  .x-toolbar-cell:first-child button")
	WebElement btnOuiExitForm;

	@FindBy(css = ".x-window-plain.x-window.x-window-dlg .x-toolbar-left-row  .x-toolbar-cell:last-child button")
	WebElement btnNonExitForm;

	@FindBy(css = ".x-window-plain.x-window.x-window-dlg button")
	WebElement btnOK;
	
	
	
	
	
	public void clickOnBtnAdministration() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	    wait.until(ExpectedConditions.elementToBeClickable(btnAdministration)).click();
	}
	
	public void clickOnBtnAutresCreations() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	    wait.until(ExpectedConditions.elementToBeClickable(btnCreationsDiverses)).click();
	}
	
	public void clickOnBtnCreateProvider() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	    wait.until(ExpectedConditions.elementToBeClickable(btnCreationFournisseurs)).click();
	}
	
	public void clickOnBtnGestionNomenclatures() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	    wait.until(ExpectedConditions.elementToBeClickable(btnGestionDesNomenclatures)).click();
	}
	
	public void clickOnBtnCompteDeGestion() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	    wait.until(ExpectedConditions.elementToBeClickable(btnCompteDeGestion)).click();
	}
	
	public void clickOnBtnLogout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
	    wait.until(ExpectedConditions.elementToBeClickable(btnLogout)).click();
	}
	
	
			/** Boites de dialogue **/

	// Bouton OUI
	public void clickOnBtnOuiExitForm() {
		btnOuiExitForm.click();
	}

	// Bouton NON
	public void clickOnBtnNonExitForm() {
		btnNonExitForm.click();
	}

	// Bouton OK
	public void clickOnBtnOK() {
		btnOK.click();
	}


}
