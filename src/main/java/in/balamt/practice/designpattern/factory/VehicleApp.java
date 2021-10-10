package in.balamt.practice.designpattern.factory;

public class VehicleApp {

	public static void main(String[] args) {

		Vehicle vehicle = null; //Interface

		String carVehicle = "CAR";
		
		//Getting the Enum type
		switch (VehicleType.valueOf(carVehicle)) {
		case CAR:
			//Creating Object
			vehicle = new Car();
			vehicle.drive();
			break;
		case AUTO:
			//Creating Object
			vehicle = new Auto();
			vehicle.drive();
			break;
		case BIKE:
			//Creating Object
			vehicle = new Bike();
			vehicle.drive();
			break;
		}
	}
}
