package in.balamt.practice.solid.ocp;

import in.balamt.practice.util.JavaPracticeUtils;

import java.util.ArrayList;
import java.util.List;

public class OCPCalculateAreaApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,3);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(2,4);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(rectangle);
        shapes.add(circle);

        shapes.add(triangle);

        /*
         * Since we have created area method inside each shapes class and implemented it
         * the operation cannot be modified, but it is open for extension. meaning it is extended from parent
         * so that we were able to calculate the total Area.
         */
        AreaCalculator areaCalculator = new AreaCalculator(shapes);

        JavaPracticeUtils.printLine(areaCalculator.calculateArea());
    }
}
