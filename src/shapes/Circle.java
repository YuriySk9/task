package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + getArea() +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    public String getRadius() {
        return "Radius: " + radius;
    }
}
