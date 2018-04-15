package Basics;

public class quiz1 {

	public static void main(String[] args) {		
		int[] num = { 2, 4, 6, 8, 10};
		
		System.out.println("Max is: " + max(num));
		System.out.println("Min is: " + min(num));
		System.out.println("Avg is: " + avg(num));
		System.out.println(fac(5));
		System.out.println(addnumbers(4));
	}
	
	// Max
	public static int max(int[] x) {
		int temp = x[0];
		
		for(int i=0; i<x.length; i++) {
			if (temp < x[i])
				temp = x[i];
		}
		return temp;
	
	}
	// Min
		public static int min(int[] x) {
			int temp = x[0];
			
			for(int i=0; i<x.length; i++) {
				if (temp > x[i])
					temp = x[i];
			}
			return temp;
		}
	// Average
			public static int avg(int[] x) {
				int total = 0;
				
				for(int i=0; i<x.length; i++) {
					total += x[i];
					
				}
				return total/x.length;
				}
		//Recursive factorial
			public static int fac(int n) {

			     if (n == 1) {
			           return 1;
			}

			       else {
			      return( n * fac(n - 1));
			      }

			}
			public static int addnumbers(int n) {

		        int sum = n + 1;

		        return sum;    

		}
}

