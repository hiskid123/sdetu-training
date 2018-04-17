package Algorithms;

public class Search {
	
	public static int linearSearch(int [] dataset, int target) {
		// Iterate through dataset looking for target
		for (int i=0;i<dataset.length;i++) {
			if (dataset[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] dataset, int target, int start, int end) {
		// Binary search assumes a sorted array and then can therefore continually split our search domain in half
		int midpoint = (int) Math.floor(((start+end)/2));
		int value = dataset[midpoint];
		System.out.println("Searching between " + dataset[start] + " and " + dataset[end]);
		System.out.println("Midpoint is: " + dataset[midpoint]);
		

		if (target > value) {
			System.out.println(target + " > " + value);
			return binarySearch(dataset, target, midpoint + 1, end);
		}
		else if (target < value) {
			System.out.println(target + " < " + value);
			return binarySearch(dataset, target, start, midpoint - 1);
		}
		System.out.println(target + " = " + value);
		return midpoint;
	}
	
}
