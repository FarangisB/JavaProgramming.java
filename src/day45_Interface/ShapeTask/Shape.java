package day45_Interface.ShapeTask;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();


    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
