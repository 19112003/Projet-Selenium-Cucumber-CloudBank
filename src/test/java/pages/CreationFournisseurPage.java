package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreationFournisseurPage {

	WebDriver driver;
	
	public CreationFournisseurPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
			
				/******* WEBELEMENTS *******/
		
			/** Elements formulaire principal **/

	@FindBy(name = "nameProvider")
	WebElement nom;

	@FindBy(name = "single")
	WebElement situation_matrimoniale;

	@FindBy(name = "code")
	WebElement code;

	@FindBy(name = "account.numeroCompletTirets")
	WebElement compte;

	@FindBy(name = "country.name")
	WebElement pays;

	@FindBy(name = "villeProvider")
	WebElement ville;

	@FindBy(name = "telephoneOne")
	WebElement telephone;

	@FindBy(name = "adresseProvider")
	WebElement adresse;

	@FindBy(name = "capital")
	WebElement capital;

	@FindBy(name = "bp")
	WebElement bp;

	@FindBy(name = "capaciteJuridique.libelle")
	WebElement forme_sociale;
	
	@FindBy(name = "capaciteJuridique.libelle")
	private WebElement getForme_sociale;

	@FindBy(name = "secteurActivite.libelle")
	WebElement categorie;

	@FindBy(id = "btnResponsableOneProvider")
	WebElement btnDirigeant1;

	@FindBy(id = "btnResponsableTwoProvider")
	WebElement btnDirigeant2;

	@FindBy(id = "btnSauvegarderProvider")
	WebElement btnSauvegarder;

	@FindBy(id = "btValiderProvider")
	WebElement btnValidationForm;

	@FindBy(id = "btQuitterPanelProvider")
	WebElement btnQuitterForm;

	@FindBy(xpath = "//*[@id=\\\"x-auto-90\\\"]")
	WebElement iconeFermeture;

	@FindBy(id = "btnChooseFileGen")
	WebElement btnChoisirFichier;

	@FindBy(id = "btnRefreshGen")
	WebElement btnRafraichir;
	

			// MENU

	@FindBy(id = "btCreationGen")
	WebElement btnCreationForm;

	@FindBy(id = "btModificationGen")
	WebElement btnModificationForm;

	@FindBy(id = "btDupplicationGen")
	WebElement btnDuplicationForm;

	@FindBy(id = "btInterrogationGen")
	WebElement btnInterrogationForm;

	@FindBy(id = "btSuppressionGen")
	WebElement btnSuppressionForm;
	

			// ENTÊTE

	@FindBy(id = "btNouveauGen")
	WebElement btnNouveau;

	@FindBy(id = "btEffacerGen")
	WebElement btnEffacer;

	@FindBy(id = "btRechercherGen")
	WebElement btnRecherche;

	@FindBy(id = "btSupprimerGen")
	WebElement btnSuppressionEntete;

	@FindBy(id = "btImprimerGen")
	WebElement btnImprimer;

	@FindBy(id = "btQuitterGen")
	WebElement btnQuitterEntete;

	
			/** Filtre ajout de compte **/

	@FindBy(name = "filterEvtTxtF")
	WebElement filtre;

	@FindBy(id = "saveEvtTxtF")
	WebElement btnValidationCompte;
	

			/** Formulaire dirigeant 1 **/

	@FindBy(name = "firstName")
	WebElement firstname;

	@FindBy(name = "lastName")
	WebElement lastname;

	@FindBy(id = "saveEvtPers")
	WebElement btnValidationDirigeant1;

	@FindBy(id = "cancelEvtPers")
	WebElement btnQuitterDirigeant1;

	
			/** Boites de dialogue **/

	@FindBy(css = ".x-window-plain.x-window.x-window-dlg .x-toolbar-left-row  .x-toolbar-cell:first-child button")
	WebElement btnOuiExitForm;

	@FindBy(css = ".x-window-plain.x-window.x-window-dlg .x-toolbar-left-row  .x-toolbar-cell:last-child button")
	WebElement btnNonExitForm;

	@FindBy(css = ".x-window-plain.x-window.x-window-dlg button")
	WebElement btnOK;
	
	
	
	

				/******* METHODES *******/
	
		/** Elements formulaire principal **/

	// Champ Nom
	public void enterNom(String name) {
		nom.sendKeys(name);
	}

	// Champ Situation Matrimoniale
	public void enterSituation_matrimoniale(String situation) {
		situation_matrimoniale.sendKeys(situation);
	}

	// Champ Code
	public void enterCode(String Code) {
		code.sendKeys(Code);
	}
	
	public WebElement getCode() {
	    return code;
	}

	// Champ Compte
	public void enterCompte(String Compte) {
		compte.sendKeys(Compte);
	}
	
	public WebElement getCompte() {
	    return compte;
	}

	// Champ Pays
	public void enterPays(String Pays) {
		pays.sendKeys(Pays);
	}
	
	public WebElement getPays() {
	    return pays;
	}

	// Champ Ville
	public void enterVille(String Ville) {
		ville.sendKeys(Ville);
	}

	// Champ Telephone
	public void enterTelephone(String Telephone) {
		telephone.sendKeys(Telephone);
	}
	
	public WebElement getTelephone() {
	    return telephone;
	}

	// Champ Adresse
	public void enterAdresse(String Adresse) {
		adresse.sendKeys(Adresse);
	}

	// Champ Capital
	public void enterCapital(String Capital) {
		capital.sendKeys(Capital);
	}
	
	public WebElement getCapital() {
	    return capital;
	}

	// Champ BP
	public void enterBp(String Bp) {
		bp.sendKeys(Bp);
	}

	// Champ Forme Sociale
	public void enterForme_sociale(String Forme_sociale) {
		forme_sociale.sendKeys(Forme_sociale);
	}
	
	public WebElement getForme_sociale() {
	    return forme_sociale;
	}

	// Champ Categorie
	public void enterCategorie(String Categorie) {
		categorie.sendKeys(Categorie);
	}
	
	public WebElement getCategorie() {
	    return categorie;
	}

	// Bouton Dirigeant 1
	public void clickOnBtnDirigeant1() {
		btnDirigeant1.click();
	}

	// Bouton Dirigeant 2
	public void clickOnBtnDirigeant2() {
		btnDirigeant2.click();
	}

	// Bouton Sauvegarder
	public void clickOnBtnSauvegarder() {
		btnSauvegarder.click();
	}

	// Bouton Validation du formulaire
	public void clickOnBtnValidationForm() {
		btnValidationForm.click();
	}

	// Bouton Quitter le formulaire
	public void clickOnBtnQuitterForm() {
		btnQuitterForm.click();
	}

	// Icone fermer le formulaire
	public void clickOnIconeFermeture() {
		iconeFermeture.click();
	}

	// Bouton Choisir un fichier
	public void clickOnBtnChoisirFichier() {
		btnChoisirFichier.click();
	}

	// Bouton Rafraîchir
	public void clickOnBtnRafraichir() {
		btnRafraichir.click();
	}
	

				// MENU

	// Bouton Créer le formulaire
	public void clickOnBtnCreationForm() {
		btnCreationForm.click();
	}

	// Bouton Modifier le formulaire
	public void clickOnBtnModificationForm() {
		btnModificationForm.click();
	}

	// Bouton Dupliquer le formulaire
	public void clickOnBtnDuplicationForm() {
		btnDuplicationForm.click();
	}

	// Bouton Interroger le formulaire
	public void clickOnBtnInterrogationForm() {
		btnInterrogationForm.click();
	}

	// Bouton Supprimer le formulaire
	public void clickOnBtnSuppressionForm() {
		btnSuppressionForm.click();
	}

	// ENTÊTE

	// Bouton Nouveau
	public void clickOnBtnNouveau() {
		btnNouveau.click();
	}

	// Bouton Effacer
	public void clickOnBtnEffacer() {
		btnEffacer.click();
	}

	// Bouton Recherche
	public void clickOnBtnRecherche() {
		btnRecherche.click();
	}

	// Bouton Suppression entête
	public void clickOnBtnSuppressionEntete() {
		btnSuppressionEntete.click();
	}

	// Bouton Imprimer
	public void clickOnBtnImprimer() {
		btnImprimer.click();
	}

	// Bouton Quitter entête
	public void clickOnBtnQuitterEntete() {
		btnQuitterEntete.click();
	}

	/** Filtre ajout de compte **/

	// Champ filtre
	public void enterFiltre(String Filtre) {
		filtre.sendKeys(Filtre);
	}
	
	public WebElement getFiltre() {
	    return filtre;
	}

	// Bouton validation du compte
	public void clickOnBtnValidationCompte() {
		btnValidationCompte.click();
	}

	/** Formulaire dirigeant 1 **/

	// Champ Nom dirigeant 1
	public void enterFirstname(String Firstname) {
		firstname.sendKeys(Firstname);
	}

	// Champ Prénom dirigeant 1
	public void enterLastname(String Lastname) {
		lastname.sendKeys(Lastname);
	}

	// Bouton validation form dirigeant 1
	public void clickOnBtnValidationDirigeant1() {
		btnValidationDirigeant1.click();
	}

	// Bouton quitter form dirigeant 1
	public void clickOnBtnQuitterDirigeant1() {
		btnQuitterDirigeant1.click();
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
