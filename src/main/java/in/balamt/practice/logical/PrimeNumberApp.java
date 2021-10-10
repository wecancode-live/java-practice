package in.balamt.practice.logical;

public class PrimeNumberApp {

	public static void main(String[] args) {

		// Prime numbers between 1 and 31
		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 and 31
		int inputNum = Integer.MAX_VALUE;

		if (PrimeNumberApp.isPrimeOrNot(inputNum)) {
			System.out.println(String.format("%d Is Prime Number", inputNum));
		} else {
			System.out.println(String.format("%d Is Prime Not Number", inputNum));
		}

	}

	private static boolean isPrimeOrNot(int inputNum) {
		// Number should not less than equal to 1
		// And should not greater than the Integer Max value 2147483647
		if (inputNum <= 1 && inputNum > Integer.MAX_VALUE) {
			return false;
		}
		// Number 2 and 3 are prime.
		if (inputNum >= 2 && inputNum <= 3) {
			return true;
		}
		// answer = (n)^2-1 % 24
		// answer should be equal to 0
		if ((inputNum * inputNum - 1) % 24 == 0) {
			return true;
		}
		return false;
	}

}
