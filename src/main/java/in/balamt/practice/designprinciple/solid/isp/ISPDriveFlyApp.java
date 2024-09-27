package in.balamt.practice.designprinciple.solid.isp;

public class ISPDriveFlyApp {
    public static void main(String[] args) {
        // Interface segregation principle
        // Here in this principle, we have interfaces which has specific functionality,
        // meaning not having all the functionality/action into one single place.

        // For Example, We have Airplane & Car where we can fill fuel which is common for both
        // When it comes to drive/fly we have difference for Car and Aeroplane.
        // where Car can be driven and it can be stopped
        // where Airplane can fly and it can be landed.
        // So we need to maintain the actions/features accordingly.

        // So we have Driver as interface, Flyer as interface and Fuel as interface.
        // Driver interface is responsible for drive and stop
        // Flyer interface is responsible for flying and landing
        // Fuel interface is responsible for adding fuel.


        Airplane airplane = new Airplane();
        CommercialCar commercialCar = new CommercialCar();
        SportsCar sportsCar = new SportsCar();

        airplane.addFuel();
        airplane.fly();
        airplane.land();

        sportsCar.addFuel();
        sportsCar.drive();
        sportsCar.stop();

        commercialCar.addFuel();
        commercialCar.drive();
        commercialCar.stop();
    }
}
