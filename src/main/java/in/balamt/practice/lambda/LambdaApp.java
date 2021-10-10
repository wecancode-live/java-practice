package in.balamt.practice.lambda;

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

	}
}
