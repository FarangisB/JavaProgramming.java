package day10_NestedIfStatement;

public class DaysInWeek_Ternaries {

    public static void main(String[] args) {


        int n = 5; // 1~7

        if(n==1){
            System.out.println("Monday");
        }else if (n==2){
            System.out.println("Tuesday");
        }else if (n==3){
            System.out.println("Wednesday");
        }else if (n==4){
            System.out.println("Thursday");
        }else if (n==5){
            System.out.println("Friday");
        }else if (n==6){
            System.out.println("Saturday");
        }else if (n==7){
            System.out.println("Sunday");
        }


        System.out.println("__________________________________________");

        /*
        (n==1)? "Monday" : (n==2)? "Tuesday" : (n==3)? "Wednesday" : (n==4) ? "Thursday" : (n==5)? "Friday"
        : (n==6)? "Saturday" : (n==7)? "Sunday"
                */

        String result = (n==1)? "Monday" : (n==2)? "Tuesday" : (n==3)? "Wednesday" : (n==4) ? "Thursday" : (n==5)? "Friday"
                : (n==6)? "Saturday" : "Sunday";
        System.out.println(result);


    }



}
