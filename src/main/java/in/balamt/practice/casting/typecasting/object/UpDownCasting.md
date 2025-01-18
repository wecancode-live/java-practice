# UpDownCastingApp

The `UpDownCastingApp` class demonstrates the concepts of upcasting and downcasting in Java.

## Class Structure

- **UpDownCastingApp**: The main class containing the `main` method and the `temp` method.
- **Parent**: A static inner class with a method `method1`.
- **Child**: A static inner class extending `Parent` and overriding the `method1` method.

## Concepts

- **Upcasting**: Assigning a child class object to a parent class reference. This is done implicitly and does not require explicit casting.
- **Downcasting**: Assigning a parent class reference to a child class reference. This requires explicit casting.

## Code Example

```java
package in.balamt.practice.casting.typecasting.object;

import in.balamt.practice.util.JavaPracticeUtils;

public class UpDownCastingApp {

    public static void main(String[] args) {
        new UpDownCastingApp().temp(args);
    }

    public void temp(String[] args) {
        // Upcasting - assigning a child class object to a parent class reference
        Parent p = new Child();

        // Downcasting - assigning a parent class reference to a child class reference
        Child c = (Child) p;

        p.method1(); // Calls the overridden method in Child class
        c.method1(); // Calls the overridden method in Child class
    }

    static class Parent {
        public void method1() {
            JavaPracticeUtils.printLine("Parent method1");
        }
    }

    static class Child extends Parent {
        public void method1() {
            JavaPracticeUtils.printLine("Child method1");
        }
    }
}