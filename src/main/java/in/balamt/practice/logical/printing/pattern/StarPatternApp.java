package in.balamt.practice.logical.printing.pattern;

import in.balamt.practice.util.JavaPracticeUtils;

public class StarPatternApp {

	public static void main(String[] args) {

		StarPatternApp.printPattern("*", 5);

	}

	/**
	 * Print pattern like below, By giving the max length of the print. 
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 * @param pattern
	 * @param size
	 */
	private static void printPattern(String pattern, int size) {

		StringBuilder patternBuilder = new StringBuilder();

		for (int i = 1; i <= size; i++) {
			patternBuilder.append(pattern);
			JavaPracticeUtils.print(patternBuilder.toString());
			// System.out.println(patternBuilder.toString() + addSpaceAndPrint(size + 1 -
			// i,"*"));
		}

		for (int i = size; i > 1; i--) {
			JavaPracticeUtils.print(patternBuilder.deleteCharAt(i - 1).toString());
		}

	}

	private static String addSpaceAndPrint(int spaceCount, String printStr) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < spaceCount; i++) {
			sb.append("" + i);
		}
		sb.append(printStr);

		return sb.toString();

	}

}
