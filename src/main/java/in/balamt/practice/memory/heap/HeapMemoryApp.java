package in.balamt.practice.memory.heap;

import in.balamt.practice.designprinciple.solid.dip.Calculator;

public class HeapMemoryApp {

    public static void main(String[] args) {

        //Primitive and Objects are stored in Heap Memory
        int a = 5;
        int b = 9;
        Calculator c = new Calculator();

        System.out.println(c.add(a,b));

    }

}
