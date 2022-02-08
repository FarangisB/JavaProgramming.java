package day45_Interface.ShapeTask;

public class Cylinder extends Shape implements Volume{

    private double height, radius;
    static final double pi = 3.14;

    public Cylinder(double height, double radius) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<0){
            throw new RuntimeException("Invalid value was entered: "+radius);
        }
        this.radius = radius;
    }

    public double area() {
        return pi*radius*radius;
    }
        //2πrh+2πr2 -> surface area
        // πr2 -> base area

    public double volume() {
        return pi*radius*radius*height;
    }
    // πr2h -> volume


    public String toString() {
        return "Cylinder{" +
                super.toString()+
                "height=" + height +
                ", radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}
