package day43_Abstraction_ExceptionsRecap.CarTask;

public final class Audi extends Car{

    public Audi(String model, int year, double price, String color, int miles) {
        super("Audi", model, year, price, color, miles);
    }

    public void start() {
        System.out.println("Push the start button.");
    }

    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+ " has auto park feature.");
    }
}
