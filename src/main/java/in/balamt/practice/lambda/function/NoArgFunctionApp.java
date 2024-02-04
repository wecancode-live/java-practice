package in.balamt.practice.lambda.function;

import in.balamt.practice.util.JavaPracticeUtils;

public class NoArgFunctionApp {
    public static void main(String[] args) {
        NoArgFunction<String> sayHello = () -> "Hello!!";

        JavaPracticeUtils.printLine("No Arg Function call to say hello " + sayHello.apply());
    }
}
