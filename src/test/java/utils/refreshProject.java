package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class refreshProject {
	
	public static void refreshProjet() {
	    try {
	        System.out.println("Rafraichissement du projet");
	        
	        // Chemin vers le répertoire du projet Maven
	        String projectDirectory = "D:\\inet\\New\\Projet-Selenium-Cucumber-CloudBank-master";

	        // Commande à exécuter
	        String command = "cmd /c mvn clean";

	        // Créer le process builder
	        ProcessBuilder processBuilder = new ProcessBuilder(command.split("\\s+"));
	        processBuilder.directory(new File(projectDirectory));

	        // Démarrer le processus
	        Process process = processBuilder.start();

	        // Lire la sortie
	        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }

	        // Attendre que le processus se termine
	        int exitCode = process.waitFor();
	        System.out.println("\nExited with error code : " + exitCode);
	    } catch (IOException | InterruptedException e) {
	        e.printStackTrace();
	    }
	}
}
