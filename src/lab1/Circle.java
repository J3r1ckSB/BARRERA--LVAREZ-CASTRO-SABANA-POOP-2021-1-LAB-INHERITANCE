package lab1;

public class Circle extends Shape {

    private double radius;
    private double PI;
    private double Area;
    private int perimeter;
    
    

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getDiameter() {
        return 0;
    }
    
    public void getPI(){
        this.PI = PI;
    }
    
    @Override
    public double getArea() {
        this.Area = 60;
        return 0;
    }
    @Override
    public double getPerimeter() {
        this.perimeter = 60;
        return 0;
    }
    @Override
    public String toString() {
        return String.format("This is a %s with color %s"
                , this.getClass().getSimpleName()
                , this.color == null ? "NONE" : this.color);
    }

}
