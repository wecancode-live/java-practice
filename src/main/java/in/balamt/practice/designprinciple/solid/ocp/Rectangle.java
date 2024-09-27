package in.balamt.practice.designprinciple.solid.ocp;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
