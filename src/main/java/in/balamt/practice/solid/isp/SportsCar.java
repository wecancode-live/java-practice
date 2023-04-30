package in.balamt.practice.solid.isp;

public class SportsCar implements Car{
    @Override
    public void drive() {
        System.out.println("Driving Sports Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Sports car");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding fuel to Sports Car");
    }
}
