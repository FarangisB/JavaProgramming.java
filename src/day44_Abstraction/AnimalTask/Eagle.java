package day44_Abstraction.AnimalTask;

public final class Eagle extends Animal implements Hunt, Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt() {
        System.out.println(getName()+" is hunting snake");
    }

    public void flying(){
        System.out.println(getName()+" is flying.");
    }

    public void eat() {
        System.out.println(getName()+" eats snakes.");
    }

    public void fly(){
        System.out.println(getName()+" flies 1000k/h");
    }
}
