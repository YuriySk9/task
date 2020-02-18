package shapes;

public class Trapeze  extends Shape {
    private static final String name ="Трапецыя";
    private double sideA;
    private double sideB;
    private double sideH;

    public Trapeze(String color, double sideA, double sideB, double sideH){
        super.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    public double getHeight(){
        return sideH;
    }

    @Override
    public double getArea() {
        return Math.round(sideH*sideA*sideB/2);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Trapeze{" +
                "area=" + getArea() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideH=" + sideH +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
