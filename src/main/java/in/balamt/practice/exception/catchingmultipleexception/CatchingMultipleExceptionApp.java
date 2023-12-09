package in.balamt.practice.exception.catchingmultipleexception;

import in.balamt.practice.util.JavaPracticeUtils;

public class CatchingMultipleExceptionApp {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };

		try {
			for (int i = 0; i < arr.length + 1; i++) {
				JavaPracticeUtils.printLine(arr[i]);
			}
		} catch (NullPointerException | ArrayIndexOutOfBoundsException me) {
			JavaPracticeUtils.printLine(me.getMessage());
		}
		/**
		 * Above code is how we write after Java 7
		 */
		
		/**
		 * Below code is how we write before Java 7
		 */
		try {
			for (int i = 0; i < arr.length + 1; i++) {
				JavaPracticeUtils.printLine(arr[i]);
			}
		} catch (NullPointerException npe) {
			JavaPracticeUtils.printLine(npe.getMessage());
		} catch (ArrayIndexOutOfBoundsException ape) {
			JavaPracticeUtils.printLine(ape.getMessage());
		}
	}

}
