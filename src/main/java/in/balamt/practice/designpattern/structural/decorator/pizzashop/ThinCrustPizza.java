package in.balamt.practice.designpattern.structural.decorator.pizzashop;

public class ThinCrustPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Thin Crust Pizza";
    }

    @Override
    public double cost() {
        return .99;
    }
}
