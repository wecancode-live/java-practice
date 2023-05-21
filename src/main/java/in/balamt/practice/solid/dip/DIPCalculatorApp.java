package in.balamt.practice.solid.dip;

import in.balamt.practice.util.JavaPracticeUtils;

public class DIPCalculatorApp {
    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        Calculator calculator = new Calculator();

        JavaPracticeUtils.printLine(calculator.add(x,y));
        JavaPracticeUtils.printLine(calculator.sub(x,y));
        JavaPracticeUtils.printLine(calculator.multiply(x,y));
        JavaPracticeUtils.printLine(calculator.divide(x,y));
    }
}
