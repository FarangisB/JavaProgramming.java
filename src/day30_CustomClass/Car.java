package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void carInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;
    }

    public void drive() {
        System.out.println("Driving "+brand+" "+model);
    }
    public void start() {
        System.out.println("Starting "+brand+" "+model);
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
/**
 * ar Class:
 *
 *     Attributes:
 *         brand, model, color, year, price
 *
 *     Actions:
 *         drive(), start(), stop(), toString(), setInfo()
 *
 *
 * day36_InheritanceIntro.Incapsulation.Student Class:
 *
 *     Attributes:
 *         name, gender, age, studentID
 *
 *     Actions:
 *         eat(), sleep(), drink(), code()
 *         setInfo(): to set all the attributes of student object
 *         toString(): to print the full info of student
 */
