package day43_Abstraction_ExceptionsRecap.CarTask;

public abstract class Car {

    final String brand;
    final String model;
    private String color;
    private final int year;
    private double price;
    private int miles;
    public static int numberOfCars;


    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if(year<1886){throw new RuntimeException("Invalid year "+year);}
        this.year = year;
        setPrice(price);
        setMiles(miles);
        numberOfCars++;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if(price<=0){
            throw new RuntimeException("Invalid price "+price);
        }
        this.price = price;
    }

    public void stop(){
        System.out.println("Press the brake");
    }
    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
