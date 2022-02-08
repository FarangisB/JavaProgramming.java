package day45_Interface.ShapeTask;

public class Pentagon extends Shape implements Perimeter{

    private double base, height, side;

    public Pentagon(double base, double height, double side) {
        super("Pentagon");
        setBase(base);
        setHeight(height);
        setSide(side);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base<0){
            throw new RuntimeException("Invalid value was entered: "+base);
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height<0){
            throw new RuntimeException("Invalid value was entered: "+height);
        }
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<0){
            throw new RuntimeException("Invalid value was entered: "+side);
        }
        this.side = side;
    }

    public double area() {
        return base*height;
    }

    public double perimeter() {
        return 2*(side+base);
    }

    public String toString() {
        return "Pentagon{" +
                super.toString()+
                "base=" + base +
                ", height=" + height +
                ", side=" + side +
                '}';
    }
}
