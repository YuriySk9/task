package shapes;

public class Square extends Shape {
    private double side;

    @Override
    public String toString() {
        return "Square{" +
                "area=" + getArea() +
                ", side=" + side +
                ", color='" + color + '\'' +
                '}';
    }

    public Square(String color, double side){
        super.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    public double getSide() {
        return side;
    }
}
