package day42_Abstraction.AnimalTask;

public final class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meows(){
        System.out.println(getName()+" is meowing.");
    }

    public void eat() {
        System.out.println(getName()+" eats cat food.");
    }


}
