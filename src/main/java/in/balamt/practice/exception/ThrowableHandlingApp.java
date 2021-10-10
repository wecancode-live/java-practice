package in.balamt.practice.exception;

public class ThrowableHandlingApp {

	public static void main(String[] args) {
		ThrowableHandlingApp.handleThrowableExce();
	}

	private static void handleThrowableExce() {
		//Try catch clause to handle the Exception
		try {
			ThrowableHandlingApp.throwThrowableExce();
		} catch (ThrowableCustomException e) {
			//Printing out the Exception message we got.
			System.out.println("Execption message : " + e.getMessage());
		}
	}

	/**
	 * Throws is to specify that this method will throw a specific type of exception.
	 * @throws ThrowableCustomException
	 */
	private static void throwThrowableExce() throws ThrowableCustomException {
		//throw to throw our Exception at any place of our program.
		throw new ThrowableCustomException("My Throwable Exception");
	}

}
