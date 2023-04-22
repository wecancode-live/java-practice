package in.balamt.practice.solid.ocp;

import java.util.List;

public class AreaCalculator {
    private List<Shape> shapes;
    public AreaCalculator(List<Shape> shapes){
        this.shapes = shapes;
    }

    public double calculateArea(){
        double totalArea = 0;
        for(Shape shape : shapes){
            totalArea += shape.area();
        }
        return totalArea;
    }
}
