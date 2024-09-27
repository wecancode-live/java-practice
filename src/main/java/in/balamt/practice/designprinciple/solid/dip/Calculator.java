package in.balamt.practice.designprinciple.solid.dip;

public class Calculator {
    CalculatorOperation addOperation,subOperation,mulOperation,divOperation;
    public Calculator() {
        addOperation = new Addition();
        subOperation = new Subtraction();
        mulOperation = new Multiplication();
        divOperation = new Division();
    }

    public int add(int a, int b){
        return addOperation.calculate(a,b);
    }

    public int sub(int a, int b){
        return subOperation.calculate(a,b);
    }

    public int multiply(int a, int b){
        return mulOperation.calculate(a,b);
    }

    public int divide(int a, int b){
        return divOperation.calculate(a,b);
    }
}
