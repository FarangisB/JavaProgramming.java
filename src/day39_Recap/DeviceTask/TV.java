package day39_Recap.DeviceTask;

public class TV extends Device{

    private double screenSize;

    public TV(String brand, String model, int price, boolean hasBattery, boolean hasPowerButton, double screenSize) {
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

    public void channelUp(){
        System.out.println(getBrand()+getModel()+" is changing channel up.");
    }

    public void channelDown(){
        System.out.println(getBrand()+getModel()+" is changing channel down.");
    }

    public String toString() {
        return "TV{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", screenSize=" + screenSize +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                "}";
    }
}
