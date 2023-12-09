package in.balamt.practice.java8.defaultmethod;

import in.balamt.practice.util.JavaPracticeUtils;

public class Ford implements Vehicle {
	
	@Override
	public void drive() {
		Vehicle.super.drive();
		JavaPracticeUtils.printLine("Driving Ford car");
	}

	@Override
	public void fillFuel() {
		JavaPracticeUtils.printLine("Filling Petrol to Ford");		
	}

}
