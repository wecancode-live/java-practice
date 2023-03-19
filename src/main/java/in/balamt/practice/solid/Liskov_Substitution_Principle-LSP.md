SOLID - Liskov Substitution Principle (LSP)
----------------------------------------------------

The Liskov Substitution Principle (LSP) is a fundamental principle of object-oriented programming that states that objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program. In other words, if we have a reference to a superclass object, we should be able to replace it with an object of any of its subclasses without breaking the program's behavior.

In Java, we can illustrate the LSP with the following example. Let's say we have a superclass called Shape that has a method draw():

```java
public class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}
```

And we have two subclasses called Rectangle and Circle that inherit from the Shape class:

```java

public class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
```

```java
public class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
```
Now let's say we have a method that takes a Shape object as a parameter and calls its draw() method:

```java
 public void drawShape(Shape shape) {
    shape.draw();
    }
```
According to the LSP, we should be able to replace the Shape object with an object of any of its subclasses, and the drawShape() method should still work correctly.

For example, we can create a Rectangle object and pass it to the drawShape() method:

```java
Rectangle rectangle = new Rectangle();
drawShape(rectangle);
```
This will output "Drawing a rectangle."

Similarly, we can create a Circle object and pass it to the drawShape() method:

```java
Circle circle = new Circle();
drawShape(circle);
```
This will output "Drawing a circle."

Because both Rectangle and Circle are subclasses of Shape, and they both override the draw() method, they can be used interchangeably with Shape objects without affecting the correctness of the program. This is an example of the Liskov Substitution Principle in action.