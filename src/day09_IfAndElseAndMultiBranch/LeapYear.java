package day09_IfAndElseAndMultiBranch;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year%4==0;

        if (leapYear){ //if we use single if statement, we need to create 2 independent statements
            System.out.println("Year " + year + " is a leap Year");
        }
        if (!leapYear){
            System.out.println("Year " + year + " is not  leap Year");
        }

        System.out.println("________________________________________________");

        if (leapYear){
            System.out.println("Year " + year + " is a leap Year");
        }
        else{
            System.out.println("Year " + year + " is not a leap Year");
        }



    }



}
