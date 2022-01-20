package day39_Recap.DeviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, int price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void callNumber(long number){
        System.out.println(getBrand()+getModel()+" is calling to the number "+number);
    }

    public void textNumber(long number){
        System.out.println(getBrand()+getModel()+" is texting to the number "+number);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                "}";
    }
}
/**
 * Create a subclass of Device named Phone:
 *
 * 				Extra Methods:
 * 						call(long phoneNum), text(long phoneNum)
 */
