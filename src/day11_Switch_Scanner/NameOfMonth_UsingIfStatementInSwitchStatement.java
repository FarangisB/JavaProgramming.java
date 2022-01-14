package day11_Switch_Scanner;

public class NameOfMonth_UsingIfStatementInSwitchStatement {

    public static void main(String[] args) {

        int year = 2000; //if the year is leap year and February consists of 29 days , then we can add If statement to the Case
        int number = 5;
        String result="";  // also we can use String variable to put the result only one time in the end

        if (number>=1&&number<=12){ //we can put boolean expression before switch by using If statement

            switch (number) {
                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days"; // here we're using if statement to give boolean expression regarding February month
                    break; // also we used ternary to make shorter our command
                case 4:
                case 6:         // we can use OR operator in switch st. only by writing cases step by step
                case 9:
                case 11:
                    result = "30 days";
                    break;
                default:
                    result = "31 days";
            }
        }else{
            result="Invalid Number";
        }

        System.out.println(result);




    }


}
 /*Create a class called NameOfTheMonth, write a program that can display the name of the month

                number = 1 ~ 12

         */