package in.balamt.practice.main;

public class MainApp {

	private static boolean statBoolVariable = true;

	static {
		MainApp.main(1, 2, 3);
		/**
		 * the Static variable is already initialized, so it prints the actual value.
		 */
		System.out.println("Boolean value: " + MainApp.statBoolVariable);
	}

	static {
		/**
		 * Called Secondly Note the static variable is not initialized at this point
		 * because it is declared below the static block, So the default value is taken.
		 **/
		MainApp.main(5, 6, 7, 8, MainApp.statVariable);
	}

	private static int statVariable = step(4);

	public static void main(String[] args) {
		// Called at last or later to the static block execution
		System.out.println("Main Method having String array arguments Called..");
	}

	public static void main(Integer... args) {
		for (Integer i : args) {
			System.out.println(i);
		}
	}

	public static int step(int step) {
		System.out.println("Called after the static block is executed " + step);
		return step;
	}

}
