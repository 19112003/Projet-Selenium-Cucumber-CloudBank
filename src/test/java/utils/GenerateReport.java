package utils;

import java.io.*;

public class GenerateReport {
	
	public static void generateReport() {
		
		 try { 
			 System.out.println("Generation rapport");
           // Command to execute
           String command = "cmd /c allure serve"; 

           // Create process builder
           ProcessBuilder processBuilder = new ProcessBuilder(command.split("\\s+"));
           processBuilder.directory(new File(System.getProperty("user.home")));

           // Start the process
           Process process = processBuilder.start();

           // Read output
           BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
           String line;
           while ((line = reader.readLine()) != null) {
               System.out.println(line);
           }

           // Wait for the process to complete
           int exitCode = process.waitFor();
           System.out.println("\nExited with error code : " + exitCode);
       } catch (IOException | InterruptedException e) {
           e.printStackTrace();
       }
		
	}

}
