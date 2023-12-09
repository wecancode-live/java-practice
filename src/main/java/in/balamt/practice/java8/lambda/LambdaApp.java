package in.balamt.practice.java8.lambda;

import in.balamt.practice.util.JavaPracticeUtils;

/**
 * Reference https://alvinalexander.com/java/java-8-lambda-thread-runnable-syntax-examples
 * @author balamt
 *
 */
public class LambdaApp {

	public static void main(String... arg) {

		/**
		 * Anonymous class for thread, Older way
		 */
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous Class Thread Running");
			}
		}).start();

		/**
		 * First Way of using Lambda - Starts
		 */

		Runnable r = () -> {
			System.out.println("Runnable Way of Thread");
		};

		Thread t1 = new Thread(r);
		t1.start();

		/**
		 * First Way of using Lambda - Ends
		 */

		/**
		 * Second Way of using Lambda - Starts No Lambda Expression Flower braces
		 */
		Thread t2 = new Thread(() -> System.out.println("Without Runnable, But Directly using Thread to run"));
		t2.start();
		/**
		 * Second Way of using Lambda - Ends
		 */

		/**
		 * Third Way of using Lambda Thread is no reference to the Thread.
		 */
		new Thread(() -> System.out.println("Without having the reference created")).start();

		/**
		 * Second Way of using Lambda - Ends
		 */

        Printer p = (data) -> {
            JavaPracticeUtils.printLine("Printing from Lambda implemented method ", data);
        };

        p.print("This is my data to be printed");

        CalculatorOperations addition = (a,b) -> a+b;
        JavaPracticeUtils.printLine("Calculator Operation", "Addition" , addition.calculate(10, 20));

        CalculatorOperations subtraction = (a, b) -> {
            return a - b;
        };
        JavaPracticeUtils.printLine("Calculator Operation", "Subtraction" , subtraction.calculate(10, 20));

        CalculatorOperations multiplication = (a,b) -> (a*b);
        JavaPracticeUtils.printLine("Calculator Operation", "Multiplication" , multiplication.calculate(10, 20));

        CalculatorOperations division = (a, b) -> {
            int c = a / b;
            return c;
        };
        JavaPracticeUtils.printLine("Calculator Operation", "Division" , division.calculate(20, 10));

	}
}
