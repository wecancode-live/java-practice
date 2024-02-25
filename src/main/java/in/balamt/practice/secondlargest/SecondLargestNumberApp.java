package in.balamt.practice.secondlargest;

import in.balamt.practice.util.JavaPracticeUtils;

public class SecondLargestNumberApp {

	public static void main(String[] args) {

		int[] rank = { 91, 72, 43, 34, 85, 96, 27 }; // Given Int Array
		int largest = rank[0]; // Default taking first item of Array
		int secondLargest = rank[0]; // Default taking first item of Array

		for (int i = 0; i < rank.length; i++) { // Iterating over

			if (rank[i] > largest) { // Checking whether the item in array is greater than largest
				secondLargest = largest; // If greater than the largest then we move the largest to the secondLargest
				largest = rank[i]; // and get the item from array and assign to the largest
			} else if (rank[i] > secondLargest) { // Checking whether the item in array is greater than second largest
				secondLargest = rank[i];// If greater than the second-largest then we assign the item to secondLargest
			}

		}

		JavaPracticeUtils.printLine("Second Largest " , secondLargest);

	}

}
