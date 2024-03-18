package com.testCloudBank.selenium.tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.gwt.core.client.Duration;



public class test1 {


		WebDriver driver;
		//String mainWindowHandle = driver.getWindowHandle();
		
		@BeforeClass
		public void setUp(){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
					
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			
			driver.get("http://192.168.1.201:5303/cloudbank/index.bank");
			
		}
		
//		@BeforeMethod
//		public void waiting(){
//			
//			try {
//				Thread.sleep(8000);
//			} catch (InterruptedException e) {
//			// TODO Auto-generated catch block				
//				e.printStackTrace();
//			}
//			
//			
//		}
		
		//Test de connexion à la plateforme CloudBank
		 @Test
		 public void login(){
			 
			 //Trouver les champs à remplir pour la connexion et assignation à une variable
			 WebElement id = driver.findElement(By.id("x-auto-11"));
			 WebElement password = driver.findElement(By.id("x-auto-12"));
			 
			 //Remplissage des champs
			 id.sendKeys("sa");
			 password.sendKeys("Sa@123");
			 
			
			 
			 //Trouver et cliquer sur le bouton de validation
			 driver.findElement(By.cssSelector("#x-auto-10 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")).click();
			 
			 try {
					Thread.sleep(40000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block				
					e.printStackTrace();
				}
			 
		 }
		 
		 
		 //Test de création d'un fournisseur. Chemin: Administration - Création diverses - Création fournisseur
		 @Test
		 public void CreationFournisseur(){
			 
			 //Trouver le bouton Administation et cliquer sur celui ci
			 if(driver.getPageSource().contains("Administration")) {
					System.out.println("Administration");
			}
			 
			 String selector = "#x-auto-89 .x-btn-mc"; 
		        System.out.println("Chargement des selecteurs");
		        try {
		            
		            WebDriverWait wait = new WebDriverWait(driver,25);
		            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(selector)));
		            
		            System.out.println(element);
		            element.click();

		        } catch (Exception e) {
		            System.out.println("L'élément n'a pas été trouvé.");
		        }	
			 //
			 //Trouver le bouton Création diverses et cliquer sur celui ci
			 
			 
			//Trouver le bouton Création fournisseur et cliquer sur ce dernier
			 
			 
			//Remplir le formulaire de création de fournisseur
					
		 }
		 
		
		 
		 
		 
		 
		 
				
//			@Test
//			public void checkConnexion(){
//				
//			    Set<String> windowHandles = driver.getWindowHandles();
//				// Wait for the new window or dialog to open
//			    
//			    for (String handle : windowHandles) {
//			        if (!handle.equals(mainWindowHandle)) {
//			            // Switch to the window with the specified handle
//			             driver.switchTo().window(handle);
//			            
//				WebDriverWait wait = new WebDriverWait(driver, 10);
//				
//			        }
//			      }
				//wait.until(ExpectedConditions.numberOfWindowsToBe(2));
				//System.out.println(alert1.getText());
				
				//
//				 //Connexion reussie
//				 ///if(driver.getPageSource().contains("Chargement des données, veuillez patienter")) {
//					 //System.out.println("Connexion réussie");
//				   if(driver.getPageSource().contains("Utilisateur déjà connecté sur le systeme.")) {
//					 
//				 } else if(driver.getPageSource().contains("Compte ou mot de passe incorrect")){
//					 System.out.println("Echec de connexion");
//				 }
//				
			//}
			    
			 
			 
			 
			rat 
			 //Si une connexion déjà en cours, accpeter la déconnexion
			  //if(driver.getPageSource().contains("Utilisateur déjà connecté sur le systeme.")) {
				  //driver.findElement(By.cssSelector("#x-auto-25 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")).click();
				  
				  
					
//				  id.sendKeys("sa");
//				  password.sendKeys("Sa@123");
//				  driver.findElement(By.cssSelector("#x-auto-10 > tbody > tr:nth-child(2) > td.x-btn-mc > em > button")).click();
			  //}
		 
		 
	

}
