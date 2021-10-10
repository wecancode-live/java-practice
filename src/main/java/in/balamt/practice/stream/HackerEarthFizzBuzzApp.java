package in.balamt.practice.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerEarthFizzBuzzApp {

	public static void main(String... arg) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer tCase = Integer.parseInt(br.readLine());
		String[] inCases = br.readLine().split(" ");
		Integer[] caseToExecute = new Integer[inCases.length];

		for (int index = 0; index < inCases.length; index++) {
			caseToExecute[index] = Integer.parseInt(inCases[index]);
		}

		for (int counter = 0; counter < caseToExecute.length; counter++) {

			for (int i = 1; i < caseToExecute[counter]; i++) {

				if (multipleOfThree(i)) {
					System.out.println(i);
				}

			}

		}

	}

	private static boolean multipleOfThree(int i) {
		// TODO Auto-generated method stub
		return true;
	}

}
