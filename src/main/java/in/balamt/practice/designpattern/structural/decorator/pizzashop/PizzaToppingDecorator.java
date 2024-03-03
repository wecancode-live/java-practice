package in.balamt.practice.designpattern.structural.decorator.pizzashop;

public abstract class PizzaToppingDecorator extends Pizza {
    //We force the condiment's to override the description, so that they can alter the description.
    public abstract String getDescription();
}
