package in.balamt.practice.designpattern.factory;

public class VehicleFactory {
    public static Vehicle CreateVehicle(VehicleType vehicleType){
        Vehicle vehicle = null;
        switch (vehicleType) {
            case CAR:
                //Creating Object
                vehicle = new Car();
                break;
            case AUTO:
                //Creating Object
                vehicle = new Auto();
                break;
            case BIKE:
                //Creating Object
                vehicle = new Bike();
                break;
        }
        return vehicle;
    }
}
