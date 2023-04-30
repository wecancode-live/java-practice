package in.balamt.practice.solid.isp;

public class Airplane implements Flyer, Fuel{
    @Override
    public void fly() {
        System.out.println("Flying Airplane");
    }

    @Override
    public void land() {
        System.out.println("Landing Airplane");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding Fuel to Airplane");
    }
}
