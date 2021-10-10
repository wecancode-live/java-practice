package in.balamt.practice.designpattern.factory;

public enum VehicleType {

	CAR("Car"), BIKE("Bike"), AUTO("Auto");

	private String code;

	VehicleType(String code) {
		this.code = code;
	}

	public String code() {
		return this.code;
	}

	@Override
	public String toString() {
		return this.code;
	}

}
