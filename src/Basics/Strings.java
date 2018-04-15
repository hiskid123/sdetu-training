package Basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word Ring");
			
		}
		String browser = "Chrome";
			if (browser.equalsIgnoreCase("chrome")) {
				System.out.println("The browser is chrome");
			}
	
			String Firstname = "Tim";
			String lastName = "Short";
			String SSN = "262165262";
			
			System.out.println("There are " + SSN.length() + " digits in your SSN");
			
			//Print the initials plus 4 digits of SSN
			System.out.println(Firstname.substring(0, 3));
			System.out.println(lastName.substring(0, 3));
			System.out.println(SSN.substring(5,9));
			
	
	}
	
	

}
