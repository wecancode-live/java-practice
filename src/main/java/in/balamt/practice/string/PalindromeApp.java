package in.balamt.practice.string;

public class PalindromeApp {

	public static void main(String[] args) {

		String input = "Dad";

		if (PalindromeApp.isPalindrome(input)) {
			System.out.println(String.format("%s is palindrome", input));
		} else {
			System.out.println(String.format("%s is NOT palindrome", input));
		}

	}

	private static Boolean isPalindrome(String input) {

		char[] inputArr = input.toLowerCase().toCharArray();
		char[] reverse = new char[inputArr.length];

		for (int i = 0; i < inputArr.length; i++) {
			reverse[i] = inputArr[(inputArr.length - 1) - i];
		}
		String r = new String(reverse); // String.copyValueOf(reverse);
		return (input.equals(r));
	}

}
