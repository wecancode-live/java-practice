package in.balamt.practice.exception;

import java.util.logging.Logger;

public class FinallyApp {
	
	private static final Logger LOG = Logger.getLogger(FinallyApp.class.getName());

	public static void main(String[] args) {
		callTestMethod();
	}

	private static void callTestMethod() {
		try {
			testMethod();
		} catch (Exception e) {
			// Executed at 4 will be printed
			LOG.info(e.getMessage());
			// Executed at 5/last
			LOG.info("Catch Block of CallTestMethod");
		}
	}

	private static boolean testMethod() throws Exception {
		try {
			// Executed at 1
			LOG.info("Try Block");
			throw new Exception("Throwing from try");
		} catch (Exception e) {
			// Executed at 2
			LOG.info("Catch Block");
			// Executed at 4
			throw new Exception("Throwing from catch");
		} finally {
			// Executed at 3
			LOG.info("Finally Executing");
		}

	}

}
