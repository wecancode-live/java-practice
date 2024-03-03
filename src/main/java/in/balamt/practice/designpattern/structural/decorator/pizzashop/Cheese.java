package in.balamt.practice.designpattern.structural.decorator.pizzashop;

public class Cheese extends PizzaToppingDecorator {
    Pizza pizza;
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + ", Cheese";
    }

    @Override
    public double cost() {
        return this.pizza.cost() + .05;
    }
}
