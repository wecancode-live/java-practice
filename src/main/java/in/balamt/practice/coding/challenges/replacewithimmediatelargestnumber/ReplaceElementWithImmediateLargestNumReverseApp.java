package in.balamt.practice.coding.challenges.replacewithimmediatelargestnumber;

import java.util.Arrays;

public class ReplaceElementWithImmediateLargestNumReverseApp {
    public static int[] rearrangeList(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;

        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = -1; // Initialize each element with -1
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    result[i] = nums[j]; // Replace with the next immediate larger element
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        System.out.println("Original list: " + Arrays.toString(nums));

        int[] rearrangedList = rearrangeList(nums);
        System.out.println("Rearranged list: " + Arrays.toString(rearrangedList));
    }
}
