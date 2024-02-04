package in.balamt.practice.funinterface;

import in.balamt.practice.util.JavaPracticeUtils;

public class LambdaWithArgApp {

    public static void main(String[] args) {
        LambdaWithArg calculate = (int x, int y) -> x + y;

        JavaPracticeUtils.printLine("Calculate " + calculate.calculate(10,20));
    }
}
