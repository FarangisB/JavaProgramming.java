package day10_NestedIfStatement;

public class NameOfMonth {

    public static void main(String[] args) {

        int number = 10;
        String result = "";

        if (number>=1&&number<=12){
            // if the number is valid (1~12)

            if (number==1){
                result="January";
            }else if (number==2){
                result="February";
            }else if (number==3){
                result="March";
            }else if (number==4){
                result="April";
            }else if (number==5){
                result="May";
            }else if (number==6){
                result="June";
            }else if (number==7){
                result="July";
            }else if (number==8){
                result="August";
            }else if (number==9){
                result="September";
            }else if (number==10){
                result="October";
            }else if (number==11){
                result="November";
            }else {
                result="December";
            }


        }else{
            result = "Invalid";
        }

        System.out.println(result);


    }

}
 /*Create a class called NameOfTheMonth, write a program that can display the name of the month

                number = 1 ~ 12

         */