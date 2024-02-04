package in.balamt.practice.funinterface;

import in.balamt.practice.util.JavaPracticeUtils;

public class GreetingImpl implements Greeting {
    @Override
    public void sayHello() {
        JavaPracticeUtils.printLine("Hello World");
    }
}
