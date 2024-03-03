package in.balamt.practice.designpattern.structural.decorator.pizzashop;

import in.balamt.practice.util.JavaPracticeUtils;

public class PizzaShopApp {
    public static void main(String[] args) {
        Pizza pizza = new ThinCrustPizza();
        pizza = new Cheese(pizza);
        pizza = new Onion(pizza);

        JavaPracticeUtils.printLine(pizza.getDescription());
        JavaPracticeUtils.printLine(pizza.cost());

        Pizza pizza1 = new ThickCrustPizza();
        pizza1 = new Onion(pizza1);
        pizza1 = new Cheese(pizza1);

        JavaPracticeUtils.printLine(pizza1.getDescription());
        JavaPracticeUtils.printLine(pizza1.cost());


    }
}
