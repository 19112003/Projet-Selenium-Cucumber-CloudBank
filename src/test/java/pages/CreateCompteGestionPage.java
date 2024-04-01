package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCompteGestionPage {
	
	WebDriver driver;
	
	public CreateCompteGestionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "accountByParent.number")
	WebElement chapitre;
	
	@FindBy(name = "numeroOrdre")
	WebElement compte;

	
	@FindBy(name = "intitule")
	WebElement intitule;

	
	@FindBy(id = "btValiderCompteGestion")
	WebElement btnValidation;

	@FindBy(id = "btQuitterPanelCompteGestion")
	WebElement btnQuit;
	
	
	// Champ Chapitre
	public void enterChapitre(String Chapitre) {
		chapitre.sendKeys(Chapitre);
	}
	
	public WebElement getChapitre() {
	    return chapitre;
	}
	
	// Champ Compte
	public void enterCompte(String Compte) {
		compte.sendKeys(Compte);
	}
	
	public WebElement getCompte() {
	    return compte;
	}

	
	// Champ Intitulé
	public void enterIntitule(String Intitule) {
		intitule.sendKeys(Intitule);
	}

	
	// Bouton Validation
	public void clickOnBtnValidation() {
		btnValidation.click();
	}

	
	// Bouton Quitter
	public void clickOnBtnQuit() {
		btnQuit.click();
	}



}
