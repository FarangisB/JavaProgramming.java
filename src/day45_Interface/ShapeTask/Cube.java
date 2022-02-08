package day45_Interface.ShapeTask;

public class Cube extends Shape implements Volume{

    private double edge;

    public Cube(double edge) {
        super("Cube");
        setEdge(edge);
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        if (edge<0){
            throw new RuntimeException("Invalid value was entered: "+edge);
        }
        this.edge = edge;
    }

    public double area() {
        return 6*(edge*edge);
    }

    public double volume() {
        return edge*edge*edge;
    }

    public String toString() {
        return "Cube{" +
                super.toString()+
                "edge=" + edge +
                '}';
    }
}
