package day42_Abstraction.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Susy", "Siams", 'F', 3, "Small", "white");
        Dog dog = new Dog("Arnold", "Husky", 'M', 4, "Big", "Black");
        Eagle eagle = new Eagle("Lusifer", "Bald eagle", 'F', 5, "Midium", "Brown and Black");
        Parrot parrot = new Parrot("Hello", "Colored", 'M', 1, "Small", "Colorful");
        Tiger tiger = new Tiger("Predator", "African tiger", 'F', 6, "Big", "Brown");

        System.out.println("cat = " + cat);
        System.out.println("dog = " + dog);
        System.out.println("eagle = " + eagle);
        System.out.println("parrot = " + parrot);
        System.out.println("tiger = " + tiger);


    }
}
