package in.balamt.practice.designpattern.structural.decorator.pizzashop;

public abstract class Pizza {
    String description = "Unknown Pizza Crust";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
