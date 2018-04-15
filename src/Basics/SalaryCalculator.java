package Basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//Lets create a variable to define our career
		
		//Declare a variable
		String career;
		System.out.println("Program is starting");
		
		//Defined a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		//Declare & Define
		int hoursperweek = 40;
		int weeksperyear = 50;
		double rate = 42.50;
		career = "Web Developer";
		double salary = hoursperweek * weeksperyear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
				
		// compute our annual salary
		// rate * Hoursperweek * weeksperyear
	}
}
