package day45_Interface.ShapeTask;

public class Rectangle extends Shape implements Perimeter{

    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<0){
            throw new RuntimeException("Invalid value was entered: "+length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<0){
            throw new RuntimeException("Invalid value was entered: "+width);
        }
        this.width = width;
    }

    public double area() {
        return length*width;
    }

    public double perimeter() {
        return 2*length+2*width;
    }

    public String toString() {
        return "Rectangle{" +
                super.toString()+
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
