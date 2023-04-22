package in.balamt.practice.solid.ocp;

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
}
