package in.balamt.practice.java8.abstractclass;

import in.balamt.practice.util.JavaPracticeUtils;

public class Kiwi extends Bird {

	@Override
	void fly() {
		JavaPracticeUtils.printLine("Kiwi is Flying");
	}

	@Override
	void run() {
		JavaPracticeUtils.printLine("Kiwi is Running");
	}

}
