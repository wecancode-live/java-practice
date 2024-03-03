package in.balamt.practice.designpattern.structural.decorator.pizzashop;

public class Onion extends PizzaToppingDecorator {
    Pizza pizza;
    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Onion";
    }

    @Override
    public double cost() {
        return this.pizza.cost() + .05;
    }
}
