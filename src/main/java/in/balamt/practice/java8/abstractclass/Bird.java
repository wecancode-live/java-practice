package in.balamt.practice.java8.abstractclass;

import in.balamt.practice.util.JavaPracticeUtils;

public abstract class Bird {
	
	Bird(){
		JavaPracticeUtils.printLine("Bird initialized");
	}

	abstract void fly();

	void layEggs() {
		JavaPracticeUtils.printLine("Bird Lay Eggs");
	}

	void walk() {
		JavaPracticeUtils.printLine(String.format("Bird walking with %d", legCount()));
	}

	private int legCount() {
		return 2;
	}
	
	abstract void run();

}
