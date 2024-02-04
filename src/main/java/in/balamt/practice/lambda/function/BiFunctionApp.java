package in.balamt.practice.lambda.function;

import in.balamt.practice.util.JavaPracticeUtils;

import java.util.function.BiFunction;

public class BiFunctionApp {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add =
                (x,y) -> x+y;

        JavaPracticeUtils.printLine("Add " + add.apply(10,20));
    }
}
