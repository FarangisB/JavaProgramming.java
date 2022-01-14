package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        /*
        1. firstName
        2. lastName
         */

        String firstName = "Farangis";
        String lastName = "Bayzaeva";
        int age = 34;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

//Full name of the person is _______
        System.out.println("Full name of the person is " + fullName + ".");

        // ______ is ____ years old

        System.out.println(fullName + " is " + age + " years old.");

        //FullName is JobTitle, works at CompanyName, and fullName's salary is

        System.out.println(fullName + " is " + jobTitle + ", works at "
                + companyName + ", and " + fullName + "'s salary is $" + salary + ".");




    }
}
