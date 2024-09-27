package in.balamt.practice.designpattern.factory;

public class FactoryApp {

	public static void main(String[] args) {
		Vehicle vehicle = VehicleFactory.CreateVehicle(VehicleType.CAR);
		vehicle.drive();

		vehicle = VehicleFactory.CreateVehicle(VehicleType.BIKE);
		vehicle.drive();
	}
}
