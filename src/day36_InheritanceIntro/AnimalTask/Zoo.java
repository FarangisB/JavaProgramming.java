package day36_InheritanceIntro.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog =new Dog();
        dog.setInfo("Max", "Husky", "Small", "Black", 'F', 3);

        dog.eat();
        dog.drink();
        dog.bark();
        dog.sleep();
        dog.move();
      //dog.hunt();
      //dog.scratch();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", "Small", "Brown", 'M', 3);

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();
      //cat.bark();
      //cat.hunt();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", "Big", "Strapped Brown", 'M', 5);

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);

        //  tiger.bark();



    }
}
