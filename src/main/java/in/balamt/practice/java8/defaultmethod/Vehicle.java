package in.balamt.practice.java8.defaultmethod;

import in.balamt.practice.util.JavaPracticeUtils;

public interface Vehicle {

	// Default method
	default void drive() {
		JavaPracticeUtils.printLine("Driving Vehicle");
	}

	// Default method
	default void applyBreak() {
		JavaPracticeUtils.printLine("Applying Break");
	}

	void fillFuel();

	static void engine(boolean power) {
		if (power)
			JavaPracticeUtils.printLine("Engine ON");
		else
			JavaPracticeUtils.printLine("Engine OFF");
	}

}
