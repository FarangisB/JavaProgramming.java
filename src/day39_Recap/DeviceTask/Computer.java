package day39_Recap.DeviceTask;

public class Computer extends Device{

    private double screenSize;

    public Computer(String brand, String model, int price, boolean hasBattery, boolean hasPowerButton, double screenSize) {
        super(brand, model, price, hasBattery, hasPowerButton);
        setScreenSize(screenSize);
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize<=0){
            System.err.println("Invalid size. Please try again: "+screenSize);
            System.exit(1);
        }
        this.screenSize = screenSize;
    }



    public String toString() {
        return "Computer{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", screenSize=" + screenSize +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
