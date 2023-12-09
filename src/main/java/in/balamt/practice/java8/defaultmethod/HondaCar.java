package in.balamt.practice.java8.defaultmethod;

import in.balamt.practice.util.JavaPracticeUtils;

public class HondaCar implements Vehicle {

	@Override
	public void drive() {
		Vehicle.super.drive();
		JavaPracticeUtils.printLine("Manufacture of Car is Honda");
	}

	@Override
	public void fillFuel() {
		JavaPracticeUtils.printLine("Charging Honda Cars");
	}

}
