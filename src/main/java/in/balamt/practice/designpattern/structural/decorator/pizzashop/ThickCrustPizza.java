package in.balamt.practice.designpattern.structural.decorator.pizzashop;

public class ThickCrustPizza extends Pizza {
    @Override
    public String getDescription() {
        return "Thick Crust Pizza";
    }

    @Override
    public double cost() {
        return 1.02;
    }
}
