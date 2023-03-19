SOLID - Dependency Inversion Principle (DIP)
----------------------------------------------------

The Dependency Inversion Principle (DIP) is a principle of object-oriented programming that states that high-level modules should not depend on low-level modules. Instead, both high-level and low-level modules should depend on abstractions. This means that we should not rely on concrete implementations of dependencies, but rather on abstractions that can be implemented by any concrete class.

In Java, we can illustrate the DIP with the following example. Let's say we have a class called Calculator that performs some calculations:

```java
public class Calculator {
    private Addition addition;
    private Subtraction subtraction;
    private Multiplication multiplication;
    private Division division;

    public Calculator() {
        this.addition = new Addition();
        this.subtraction = new Subtraction();
        this.multiplication = new Multiplication();
        this.division = new Division();
    }

    public int add(int a, int b) {
        return addition.add(a, b);
    }

    public int subtract(int a, int b) {
        return subtraction.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return multiplication.multiply(a, b);
    }

    public int divide(int a, int b) {
        return division.divide(a, b);
    }
}
```

This class has four dependencies (Addition, Subtraction, Multiplication, and Division) that are tightly coupled to the Calculator class. If we ever need to change the behavior of any of these dependencies, we would need to modify the Calculator class, violating the DIP.

To apply the DIP, we can create an interface called CalculatorOperation that represents a mathematical operation:

```java
public interface CalculatorOperation {
    public int calculate(int a, int b);
}
```
Now we can create concrete classes that implement the CalculatorOperation interface for each operation:

```java
public class Addition implements CalculatorOperation {
    public int calculate(int a, int b) {
        return a + b;
    }
}

public class Subtraction implements CalculatorOperation {
    public int calculate(int a, int b) {
        return a - b;
    }
}

public class Multiplication implements CalculatorOperation {
    public int calculate(int a, int b) {
        return a * b;
    }
}

public class Division implements CalculatorOperation {
    public int calculate(int a, int b) {
        return a / b;
    }
}
```

Finally, we can modify the Calculator class to use the CalculatorOperation interface instead of concrete implementations of dependencies:

```java
public class Calculator {
    private CalculatorOperation addition;
    private CalculatorOperation subtraction;
    private CalculatorOperation multiplication;
    private CalculatorOperation division;

    public Calculator(CalculatorOperation addition, CalculatorOperation subtraction, CalculatorOperation multiplication, CalculatorOperation division) {
        this.addition = addition;
        this.subtraction = subtraction;
        this.multiplication = multiplication;
        this.division = division;
    }

    public int add(int a, int b) {
        return addition.calculate(a, b);
    }

    public int subtract(int a, int b) {
        return subtraction.calculate(a, b);
    }

    public int multiply(int a, int b) {
        return multiplication.calculate(a, b);
    }

    public int divide(int a, int b) {
        return division.calculate(a, b);
    }
}
```

Now we can create instances of the concrete classes and pass them to the Calculator constructor, or even use dependency injection frameworks to manage the dependencies. By using interfaces and abstractions, we have decoupled the Calculator class from its dependencies, making it more flexible and easier to maintain, which is the essence of the Dependency Inversion Principle.