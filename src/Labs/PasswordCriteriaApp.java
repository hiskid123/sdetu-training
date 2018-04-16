package Labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PasswordCriteriaApp {

	public static void main(String[] args) {
		String filename = "C:\\Users\\cameron\\Documents\\Files\\Passwords.txt";
		File file = new File(filename);
		String[] passwords = new String[13];

		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i<passwords.length; i++) {		
					passwords[i] = br.readLine();
				} 
				br.close();
		} catch (FileNotFoundException e) {	System.out.println("ERROR: File not found");
		} catch (IOException e) {System.out.println("ERROR: Could not read file");;}
		// A valid phone number:
					// 10 Digits long
					// Area code cannot start in 0 or 9
					// There can not be 911 in the phone number
		for (String password : passwords) {
			System.out.println("****\n" + password);
			boolean letter = false;
			boolean number = false;
			boolean character = false;

				for (int n=0;n<password.length();n++)
					// Condition 1 contains a number
					if ("0123456789".contains(password.substring(n, n+1))) {
						number=true;
					}
					
					// Condition 2: contains a letter
					else if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(password.substring(n, n+1))) {
						letter=true;
					}
					
					// Condition 3: contains special character, !@#$
					else if ("!@#$%^&*()-_+=".contains(password.substring(n, n+1))) {
						character=true;
					}
					else {
						try {throw new InvalidCharacterException(password.substring(n, n+1));
						} catch (InvalidCharacterException e) {e.toString(); }			
				
		}
				//Test and Exception handling
				try {
					
					
					if (!number) {throw new NumberCriteriaException(password);}
					else if (!letter) {throw new LetterCriteriaException(password);}
					else if (!character) {throw new CharacterCriteriaException(password);}	
					else { System.out.println("Valid Password!"); }
				}   catch (NumberCriteriaException | LetterCriteriaException | CharacterCriteriaException e) {	
						System.out.println("Invalid Password");
						System.out.println(e.toString());
			}
		
		}	
		}			
}

class InvalidCharacterException extends Exception {
	String ch;
	public InvalidCharacterException(String ch) {
		this.ch=ch;
	}
	public String toString() {
		return "InvalidCharacterException: " + ch;
	}
}

class NumberCriteriaException extends Exception {
	String password ;
	public NumberCriteriaException(String password) {
		this.password=password;
	}
	public String toString() {
		return "NumberCriteriaException: " + password;
	}
}

class LetterCriteriaException extends Exception {
	String password ;
	public LetterCriteriaException(String password) {
		this.password=password;
	}
	public String toString() {
		return "LetterCriteriaException: " + password;
	}
}

class CharacterCriteriaException extends Exception {
	String password ;
	public CharacterCriteriaException(String password) {
		this.password=password;
	}
	public String toString() {
		return "CharacterCriteriaException: " + password;
	}
}
















