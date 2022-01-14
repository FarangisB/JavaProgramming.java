package day37_InheritanceContinue.AnimalTask;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", "Small", "White", 'M', 2);

        System.out.println(dog1);
        dog1.bark();
        //dog1.scratch();
        //dog1.sing();

        Cat cat1 = new Cat("Love", "Siamese", "Large", "Black", 'F', 2);

        System.out.println(cat1);
        cat1.scratch();
        //  cat1.bark();
        //  cat1.sing();

        Parrot parrot1 = new Parrot("King", "Macaw", "Small", "Colored", 'F', 2);

        System.out.println(parrot1);

        parrot1.sing();
        //  parrot1.bark();
        //  parrot1.scratch();




    }
}
