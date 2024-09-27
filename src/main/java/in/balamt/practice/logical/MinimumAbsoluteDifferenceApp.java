package in.balamt.practice.logical;

import java.util.Arrays;

public class MinimumAbsoluteDifferenceApp {

	public static void main(String[] args) {

		int[] arr = { -59, -36, -13, 6, -53, -92, -2, -96, -54, 5 };
		int result = minimumAbsoluteDifference(arr);
		System.out.println(result);
	}

	static int minimumAbsoluteDifference(int[] arr) {
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			int currentMin = Math.abs(arr[i] - arr[i + 1]);
			min = Math.min(min, currentMin);
		}
		return min;
	}

}
