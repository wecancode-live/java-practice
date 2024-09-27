package in.balamt.practice.designprinciple.solid.dip;

public class Division implements CalculatorOperation {
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}
