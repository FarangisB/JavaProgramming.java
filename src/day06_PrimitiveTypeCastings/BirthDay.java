package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {

        String name = "John";
        int bithDay = 25;
        String month = "April";
        int birthYear = 1995;

        // name was born on month/day/year.

        System.out.println(name + " was born on " + month + "/" + bithDay + "/" + birthYear + ".");

        System.out.println("______________________________________________________________________");

        // My favorite book is "bookName"

        String bookName = "The Rich Dad and The Poor Dad";

        System.out.println("My favorite book is \"" + bookName + "\".");

        /*
        \n
        \t
        \"
        \\
         */


    }

}


/*
Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.
 */