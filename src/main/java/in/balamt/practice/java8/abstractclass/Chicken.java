package in.balamt.practice.java8.abstractclass;

import in.balamt.practice.util.JavaPracticeUtils;

public class Chicken extends Bird {
	
	@Override
	void fly() {
		JavaPracticeUtils.printLine("Chicken Fly");
	}

	@Override
	void run() {
		JavaPracticeUtils.printLine("Chicken is running");
	}

}
