package day44_Abstraction.AnimalTask;

public final class Tiger extends Animal implements Hunt{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt() {
        System.out.println(getName()+" is hunting deer");
    }

    public void eat() {
        System.out.println(getName()+ " is eating deer.");
    }


}
