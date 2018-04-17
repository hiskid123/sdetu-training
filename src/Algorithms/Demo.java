package Algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 433, 26, 73, 132, 5, 35};
	//	int [] sortedNumbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 21, 32,35,45,47,51,54,58,59,64,67,71,78,81,89,91,93,95,104};
		
		//call the linear search function that searches for a specific number
	//	int pos = Algorithms.Search.linearSearch(numbers, 456);
		//System.out.println("Found at position: " + pos);

		// Call the binary search
		//int index = Algorithms.Search.binarySearch(sortedNumbers, 11, 0, sortedNumbers.length - 1);
		//System.out.println("Found at position: " + index);
		
		// Call the bubble sort function
		
		Sort.bubbleSort(numbers);
		
	}

}
