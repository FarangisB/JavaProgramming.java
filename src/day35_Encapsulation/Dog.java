package day35_Encapsulation;

public class Dog {

    public String nickname, breed, size, color;
    public char gender;
    public int age;
    public boolean isFriendly;

    public static int numberOfLegs, getNumberOfEyes, getNumberOfWings;

    public Dog(String nickname, String breed, String size, String color, char gender, int age, boolean isFriendly) {
        this.nickname = nickname;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfLegs=2;
        getNumberOfEyes=2;
        getNumberOfWings=2;
    }

    public void eat(){
        System.out.println(nickname+" is eating");
    }

    public void drink(){
        System.out.println(nickname+" is drinking");
    }

    public void sleep(){
        System.out.println(nickname+" is sleeping");
    }

    public void play(){
        System.out.println(nickname+" is playing");
    }

    public void bark(){
        System.out.println(nickname+" is barking");
    }

    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
/**
 * Create a class called Dog
 *             Variables:
 *                 breed, size, gender, age, color,
 *                 isFriendly
 *                 numberOfLegs, numberOfEyes, numberOfWings,
 *
 *             Add a constructor to initialized all the fields
 *
 *             Add a static block to initialize all the statics
 *
 *             Methods:
 *                 eat()
 *                 drink()
 *                 sleep()
 *                 play()
 *                 bark()
 *                 toString()
 */
