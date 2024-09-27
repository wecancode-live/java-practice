package in.balamt.practice.coding.challenges.linkedlistpalindrome;

import java.util.LinkedList;

public class LinkedListPalindromeApp {
    // Method to check if a linked list is palindrome
    public static boolean isPalindrome(LinkedList<Integer> list) {
        // Edge case: Empty or single-element list is palindrome
        if (list == null || list.size() <= 1) {
            return true;
        }

        int size = list.size();
        int mid = size / 2;

        // Reverse the second half of the list
        for (int i = mid; i < size; i++) {
            list.add(i, list.removeLast());
        }

        // Compare the first half with the reversed second half
        for (int i = 0; i < mid; i++) {
            if (!list.get(i).equals(list.get(size - i - 1))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example 1: [1, 2, 3, 2, 1] => palindrome
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        System.out.println("Is list1 palindrome? " + isPalindrome(list1));

        // Example 2: [1, 2, 3, 4, 5] => not palindrome
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("Is list2 palindrome? " + isPalindrome(list2));
    }
}
