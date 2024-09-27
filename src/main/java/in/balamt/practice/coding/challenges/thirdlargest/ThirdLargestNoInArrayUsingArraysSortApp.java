package in.balamt.practice.coding.challenges.thirdlargest;

import in.balamt.practice.util.JavaPracticeUtils;

import java.util.Arrays;

public class ThirdLargestNoInArrayUsingArraysSortApp {
    public static void main(String[] args) {
        int[] arr = { 100,14, 46, 47, 94, 98, 52, 86, 36, 94, 89, -23 };

        Arrays.sort(arr);
        int thirdLargestIndex = arr.length - 3;
        JavaPracticeUtils.printLine("Third largest number in array is ", arr[thirdLargestIndex]);

    }
}
