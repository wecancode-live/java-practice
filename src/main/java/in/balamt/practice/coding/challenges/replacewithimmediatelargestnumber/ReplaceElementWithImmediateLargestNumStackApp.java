package in.balamt.practice.coding.challenges.replacewithimmediatelargestnumber;

import java.util.Arrays;
import java.util.Stack;

public class ReplaceElementWithImmediateLargestNumStackApp {

    public static int[] rearrangeList(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;

        Stack<Integer> stack = new Stack<>();

        // Iterate through the list from left to right
        for (int i = 0; i < nums.length; i++) {
            // While the stack is not empty and current element is greater than
            // the element at the index stored at the top of the stack
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                // Replace the element at the index stored at the top of the stack
                // with the current element
                nums[stack.pop()] = nums[i];
            }
            // Push the index of the current element onto the stack
            stack.push(i);
        }

        // Replace remaining elements in the stack with -1
        while (!stack.isEmpty()) {
            nums[stack.pop()] = -1;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        System.out.println("Original list: " + Arrays.toString(nums));

        int[] rearrangedList = rearrangeList(nums);
        System.out.println("Rearranged list: " + Arrays.toString(rearrangedList));
    }
}
