package in.balamt.practice.solid.isp;

public class CommercialCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Commercial car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Commercial car");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding fuel to Commercial car");
    }
}
