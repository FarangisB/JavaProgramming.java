package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); //after other methods always input empty nextLine

        input.nextLine(); // in order to remove Enter key from Java's memory

        System.out.println("Enter your Full Name:");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA:");
        double gpa = input.nextDouble();

        input.nextLine(); // in order to remove Enter key from Java's memory

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println(age);
        System.out.println(fullName);
        System.out.println(gpa);
        System.out.println(schoolName);

        input.close(); // don't forget to close your scan everytime you finish with it

    }
}
