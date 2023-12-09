package in.balamt.practice.java8.defaultmethod;

public class DefaultMethodVehicleApp {

	public static void main(String[] args) {

		HondaCar hCar = new HondaCar();
		Ford fCar = new Ford();

		Vehicle.engine(true);
		
		hCar.drive();
		hCar.applyBreak();
		hCar.fillFuel();
		Vehicle.engine(false);
		
		Vehicle.engine(true);
		fCar.drive();
		fCar.applyBreak();
		fCar.fillFuel();
		Vehicle.engine(false);
		
	}

}
