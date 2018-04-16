package Labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab3 {

	public static void main(String[] args) {
		// Read password file 
		String filename = "C:\\Users\\cameron\\Documents\\Files\\Passwords.txt";
		String[] passwords = new String[13];
	
		File file= new File(filename);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0;i<passwords.length;i++) {
				passwords[i] = br.readLine();
			}	
		} catch (FileNotFoundException e) {System.out.println("ERROR: Could not open file");
		} catch (IOException e) {System.out.println("ERROR: COuld not read file");}
		// Test password against criteria
		
		for (String password : passwords) {
			System.out.println(password);
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			boolean hasInvalidChar = false;
			
			// Test each character
			for (int n=0;n<password.length();n++) {
				
				// Condition 1 contains a number
				if ("0123456789".contains(password.substring(n, n+1))) {
					hasNumber=true;
					System.out.println("Position " + n + " Contains a number");
				}
				
				// Condition 2: contains a letter
				else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n, n+1))) {
					hasLetter=true;
					System.out.println("Position " + n + " contains a letter");
				}
				
				// Condition 3: contains special character, !@#$
				else if ("!@#$%^&*".contains(password.substring(n, n+1))) {
					hasSpecialChar=true;
					System.out.println("Position " + n + " contains a special character");
				}
				else {
					hasInvalidChar=true;
					System.out.println("Position " + n + " contains an invalid character");					
				}		
			}
	
			
			// Test & Exception Handling
			if (hasInvalidChar) {
				//Throw invalidcharexception
			}
			else if (!hasNumber || !hasLetter || !hasSpecialChar) {
				
			}
	
	
		}
	}
}
