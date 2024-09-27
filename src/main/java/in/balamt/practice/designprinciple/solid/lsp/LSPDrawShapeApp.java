package in.balamt.practice.designprinciple.solid.lsp;

import in.balamt.practice.designprinciple.solid.ocp.Circle;
import in.balamt.practice.designprinciple.solid.ocp.Rectangle;
import in.balamt.practice.designprinciple.solid.ocp.Shape;
import in.balamt.practice.designprinciple.solid.ocp.Triangle;

public class LSPDrawShapeApp {

    public static void main(String[] args) {
        // Liskov Substitution principle
        // Tells us, we can use the parent's object to invoke the methods.
        // Below is such example, Rectangle, Circle & Triangle are sub-class of Shape class
        // We pass the object of the sub-class to the mehtod drawShape and
        // drawShape method accepts Shape objects, but when we pass the sub-class object it still accepts
        // and it invokes the method draw.
        Rectangle rectangle = new Rectangle(2,3);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(2,4);

        LSPDrawShapeApp.drawShape(rectangle);
        LSPDrawShapeApp.drawShape(circle);
        LSPDrawShapeApp.drawShape(triangle);
    }

    private static void drawShape(Shape shape){
        shape.draw();
    }
}
