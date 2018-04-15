package Basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printname();
		int numA = 10;
		int numB = 20;
		addnumbers(numA, numB);
		int product = multiplynumbers(numA, numB);
		//System.out.println("The product numbers " + numA + " and " + numB + " is " + multiplynumbers(numA, numB));
		System.out.println("The product numbers " + numA + " and " + numB + " is " + product);
	}
	
	static void printname() {
		System.out.println("My name is Tim");
	}

	static void addnumbers(int numberA, int numberB) {
		//This function will add two numbers
		int sum = numberA +  numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);	
	}
	
	static int multiplynumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addnumbers(product, product);
		return product;	
	}
	
}

