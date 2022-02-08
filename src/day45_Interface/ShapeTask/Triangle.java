package day45_Interface.ShapeTask;

public class Triangle extends Shape implements Perimeter{

    private double base, height, sideA, sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        super("Triangle");
        setBase(base);
        setHeight(height);
        setSideA(sideA);
        setSideB(sideB);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base<0){
            throw new RuntimeException("Invalid side number: "+base);
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0){
            throw new RuntimeException("Invalid side number: "+height);
        }
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA<0){
            throw new RuntimeException("Invalid side number: "+sideA);
        }
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB<0){
            throw new RuntimeException("Invalid side number: "+sideB);
        }
        this.sideB = sideB;
    }

    public double perimeter() {
        return (height*base)/2;
    }
    //(hb)/2 -> area


    public double area() {
        return sideA+base+sideB;
    }
    // a+b+c -> perimeter


    public String toString() {
        return "Triangle{" +
                super.toString()+
                "base=" + base +
                ", height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
