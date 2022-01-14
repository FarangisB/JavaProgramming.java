package day23_CustomMethodsPractice;

public class CustomMethodWithParameters {

    public static void main(String[] args) {

        //oddOrEven(); // the method demands additional info (inside the braces) to complete its task
        // in current case we need to put integer number
        oddOrEven(10);// parameter name appears automatically
        // after you give a number, the program will check if the number is odd or Even
        ageOfPerson(1995);

        printNumbers(20, 15);

    }

    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }
    }

    // create a function that can display the age of the person// in order to display the age we nead to know the date of birth
    public static void ageOfPerson(int bithYear){
        int age = 2021 - bithYear;
        System.out.println("Your age is: "+age);
    }

    // create a function that can print all the numbers between x and y
    public static void printNumbers(int x, int y){
        if (x<y){
            for (int i = x+1; i <y; i++) {
                System.out.println(i);
            }
        }
        if (x>y){
            for (int i = x-1; i >y ; i--) {
                System.out.println(i);
            }
        }
    }



}
