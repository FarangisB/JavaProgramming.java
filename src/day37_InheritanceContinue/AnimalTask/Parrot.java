package day37_InheritanceContinue.AnimalTask;

public class Parrot extends Animal{

    // public String parrotWingColor;

    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
        // this.parrotWingColor = parrotWingColor;
    }

    public void sing(){
        System.out.println(name+" is singing");
    }

}
