package day23_CustomMethodsPractice;

public class CustomMethodsPractice {

    public static void main(String[] args) { // main method can be created anywhere outside the other method

        helloWorld5Time(); // in order the other can be executed inside the main method, you have to call it
        System.out.println("_________________________________");
        helloCydeo5Times();// if there is any bug in the custom method, you can navigate to that method
        // just press the key ctrl in the keyboard and put your mouse on the method that you called and has bug
        // it must change the color to the blue, which means now you can navigate to that method
        System.out.println("_________________________________");

        evenNumbers();

    }

    // create a function that can print Hello World 5 times ==> must be named meaningfully ==> helloWorld5Times

    public static void helloWorld5Time(){
        // in order to method be executed you have to create main method
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

    }

    // crate a function that can print hello Cydeo 5 times ==> helloCydeo5Times

    public static void helloCydeo5Times(){
        System.out.println("Hello Cydeo!\n".repeat(5)); // this is another way to repeat the message 5 times
    }

    // create a function that can print all the even numbers from 1~10==> evenNumbers

    public static void evenNumbers(){
        for (int i = 2; i <=10 ; i+=2) {
            System.out.println(i);

        }
    }




}
