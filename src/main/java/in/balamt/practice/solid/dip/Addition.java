package in.balamt.practice.solid.dip;

public class Addition implements CalculatorOperation {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
