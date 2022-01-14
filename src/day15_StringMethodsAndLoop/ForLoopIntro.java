package day15_StringMethodsAndLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

        // loop method can be used only to repeat statements many times
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        // when the statements are not too much, we can do it this way, but when we have to repeat it a lot of times, it's better to use loop method

        System.out.println("______________________________________");

        for (int i = 1;           i<=10;        i++ ){
            // i: 1,2,3,4,5,6,7,8,9,10 ==> true; i=11 ==>false
            System.out.println("Hello World!");
        }

            //initialization     condition
            // initialization and conditions are mandatory for loop method
            // iteration decides how many times to repeat the statement before stop
            // you can skip iterator, but you will get not console error but ideological error. It wil executed again and again



    }


}
