SOLID - Open/Closed Principle (OCP)
----------------------------------------------------

The Open/Closed Principle (OCP) is a fundamental principle of object-oriented programming that states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. The idea behind OCP is that we should be able to extend the behavior of a software entity without modifying its existing code.

In Java, we can illustrate the OCP with the following example. Let's say we have a class called Shape that represents a geometric shape:

```java
public abstract class Shape {
    public abstract double area();
}
```
This class has a method called area() that returns the area of the shape. We also have two subclasses called Rectangle and Circle that inherit from the Shape class:

```java
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
```
Now let's say we have a class called AreaCalculator that calculates the area of a list of shapes:

```java
public class AreaCalculator {
    public double calculateArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
```
This class takes a list of shapes and calculates the total area by calling the area() method of each shape. According to the OCP, this class should be open for extension but closed for modification, meaning that we should be able to add new shapes without modifying the AreaCalculator class.

To achieve this, we can create a new subclass called Triangle that inherits from the Shape class and overrides the area() method:

```java
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}
```
Now, we can create a Triangle object and add it to the list of shapes:

```java
Triangle triangle = new Triangle(4, 5);
List<Shape> shapes = new ArrayList<>();
shapes.add(rectangle);
shapes.add(circle);
shapes.add(triangle);
```
And we can call the calculateArea() method of the AreaCalculator class:

```java
AreaCalculator calculator = new AreaCalculator();
double totalArea = calculator.calculateArea(shapes);
```

This will calculate the total area of all three shapes without modifying the AreaCalculator class, which is an example of the Open/Closed Principle in action. We have extended the behavior of the AreaCalculator class by adding a new shape, without modifying its existing code.