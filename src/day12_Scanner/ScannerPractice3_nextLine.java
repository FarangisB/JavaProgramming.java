package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your Programming Language:");
        String programming = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt(); // the only disadvantage of nextLine method is it reads the Enter key that is in the Scanner's memory
        // so if we want to take away the Enter key that was left from other methods, we need to input next Line again. Ex:

        input.nextLine(); // here the Enter key after Age is gone

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("fullName = "+fullName);
        System.out.println("programming = "+programming);
        System.out.println("age = "+age);
        System.out.println("school Name = "+schoolName);

        input.close();



    }
}
