package in.balamt.practice.memory.stack;

import in.balamt.practice.solid.dip.Calculator;
import in.balamt.practice.util.JavaPracticeUtils;

public class StackMemoryApp {

    public static void main(String[] args) {
        Calculator c = new Calculator();

        // Method call are stored in Stack Memory
        int b = c.add(2,3);

        JavaPracticeUtils.print(b);
    }
}
