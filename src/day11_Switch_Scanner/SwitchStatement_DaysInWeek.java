package day11_Switch_Scanner;

public class SwitchStatement_DaysInWeek {

    public static void main(String[] args) {

        int number = 8;

        /*
        if(number == 1){
            System.out.println("Monday");
        }
        ....
         */

        //   <=  <= ....

        switch(number){ //1,2,3,4,5,6,7.  ==

            case 1:
                System.out.println("Monday");
                break; // exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break; // exits the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break; // exits the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                break; // exits the switch after executing the case block

            case 5:
                System.out.println("Friday");
                break; // exits the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                break; // exits the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                break; // exits the switch after executing the case block

            default:
                System.out.println("Invalid Number");


        }




    }


}
