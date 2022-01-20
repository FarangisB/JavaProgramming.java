package day39_Recap.DeviceTask;

public class Device {

    private String brand, model;
    private int price;
    public boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, int price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.equals(null)){
            System.err.println("Invalid brand. Please try again: "+brand);
            System.exit(1);
        }

        if (brand.isEmpty()||brand.isBlank()){
            System.err.println("Brand can not be empty or blank. Please try again: "+brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.equals(null)){
            System.err.println("Invalid model. Please try again: "+model);
            System.exit(1);
        }

        if (model.isEmpty()||model.isBlank()){
            System.err.println("Model can not be empty or blank. Please try again: "+model);
            System.exit(1);
        }
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price<=0){
            System.err.println("Invalid price. Please try again: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public void turnOn(){
        System.out.println(brand+model+" is turning on");
    }

    public void turnOff(){
        System.out.println(brand+model+" is turning off");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/**
 * 1. Create a class named Device:
 * 			Variables:
 * 					brand, model, price, hasBattery, hasPowerButton
 *
 * 			Encapsulate all the fields
 *
 * 			Add a constructor to set all the fields
 *
 * 						Condition:
 * 							1. brand, model can not be null (if obj == null means it's error)
 * 							2. brand, model can not be empty or can not be blank
 * 							3. price can not be set to negative or zero
 *
 * 			Methods:
 * 				turnOn(), turnOff(), toString()
 */
