package in.balamt.practice.logical;

public class PalindromeNumberApp {

	public static void main(String[] args) {

		int inputNum = 1331;

		if (PalindromeNumberApp.isPalindrome(inputNum)) {
			System.out.println(String.format("%d is Palindrome Number", inputNum));
		} else {
			System.out.println(String.format("%d is NOT Palindrome Number", inputNum));
		}
	}

	private static boolean isPalindrome(int inputNum) {
		if (inputNum < 0 && inputNum > Integer.MAX_VALUE) {
			return false;
		}

		int reverse = 0;
		int temp = inputNum;

		while (temp != 0) {
			int reminder = temp % 10;
			reverse = reverse * 10 + reminder;
			temp = temp / 10;
		}

		return (inputNum == reverse);
	}

}
