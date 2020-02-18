package shapes;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;

    public Triangle(String color, double sideA, double sideB){
        super.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return Math.round(sideA*sideB/2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + getArea() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", color='" + color + '\'' +
                '}';
    }

    public double getHypotenuse(){
        return Math.round(Math.sqrt(sideA * sideA + sideB * sideB)*100.00)/100.00;
    }
}
