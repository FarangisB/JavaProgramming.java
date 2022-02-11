package day43_Abstraction_ExceptionsRecap.CarTask;

public class Honda extends Car{

    public Honda( String model, int year, double price, String color, int miles) {
        super("Honda", model, year, price, color, miles);
    }

    public void start() {
        System.out.println("Twist the key to ignition to start the car.");
    }
}
