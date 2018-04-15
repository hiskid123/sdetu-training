package Basics;

public class FibbonnaciApp {

	public static void main(String[] args) {
		// Fibbinnaci number is defined by the sum of the 2 previous Fobbonnaci numbers
		// Fib(0) = 0
		// Fib(1) = 1
		// Fib (2) = Fib(1) + Fib(0) = 0 + 1 =1
		// Fib (3) = Fib(2) + Fib(1) = 1 + 1 =
		// Fib (4) = Fib(3) + Fib(0) = 0 + 1 =1
		System.out.println(fib(7));
		System.out.println(fac(5));
	}

	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return( ((fib(n-1))) + (fib(n-2)));
	}
	
	public static int fac(int n) {

	     if (n == 0) {
	           return 0;
	     }
	     else if (n == 1) {
	    	 return (1 * 1);
	     }
	     return( n * fac(n - 1));
	}
}
