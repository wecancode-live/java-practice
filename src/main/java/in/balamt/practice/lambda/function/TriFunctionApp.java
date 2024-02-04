package in.balamt.practice.lambda.function;

import in.balamt.practice.util.JavaPracticeUtils;

public class TriFunctionApp {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add =
                (x,y,z) -> x + y + z;

        JavaPracticeUtils.printLine(" Add 3 inputs " + add.apply(10, 22, 43));
    }
}
