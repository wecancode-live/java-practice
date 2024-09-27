package in.balamt.practice.coding.challenges.matchingbrackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class MatchingBracketsUsingStackQueueApp {

    public static void main(String[] args) {
// Capture start time
        long startTime = System.nanoTime();
        String input = "{}([]){}{}{}{}{}()()()[][][][][]";
        System.out.println(checkMatchingBrackets(input));
        long endTime = System.nanoTime();

        // Calculate execution time in milliseconds
        long executionTimeInMillis = (endTime - startTime) / 1000000;
        System.out.println(executionTimeInMillis + " execution time");
    }
    public static boolean checkMatchingBrackets(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }else if (c == '(') {
                stack.push(')');
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false; // Mismatched brackets found
                }
            }
        }

        return stack.isEmpty(); // Check if all brackets are matched
    }
}
