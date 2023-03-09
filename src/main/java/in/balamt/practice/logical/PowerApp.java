package in.balamt.practice.logical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PowerApp {

	public static void main(String... arg) throws NumberFormatException, IOException {

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		//int tCase = Integer.parseInt(br.readLine());
		String[] val = br.readLine().split(" ");
		int L = Integer.parseInt(val[0]);
		int R = Integer.parseInt(val[1]);

		System.out.println("powerfulNums= " + (getPowerfulNumbers(L, R).size() + 1));

	}

	public static List<Integer> getPowerfulNumbers(int lowerBound, int upperBound) {
		List<Integer> powerfulNums = new ArrayList<Integer>();
		List<Integer> primeNumbersWithRange = getPrimeNumbers(lowerBound, upperBound);
		for (int i = lowerBound; i <= upperBound; i++) {
			boolean isPowerfulNumber = true;
			for (Integer primeNum : primeNumbersWithRange) {
				/**
				 * every primeNum that divides i, primeNum*primeNum must also divide i.
				 **/
				if (i % primeNum == 0 && i % (primeNum * primeNum) != 0) {
					isPowerfulNumber = false;
					break;
				}
			}
			
			if (isPowerfulNumber) {
				powerfulNums.add(i);
			}
		}

		return powerfulNums;
	}

	private static List<Integer> getPrimeNumbers(int startIndex, int endIndex) {
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for (int number = startIndex; number <= endIndex; number++) {
			if (isPrime(number)) {
				primeNumbers.add(number);
			}
		}

		return primeNumbers;
	}

	/**
	 * Check for Primer Number
	 * 
	 * @param number
	 * @return boolean
	 */
	public static boolean isPrime(int number) {
		if (number % 2 == 0 || number == 1) {
			return (number == 2);
		}

		for (int i = 3; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
