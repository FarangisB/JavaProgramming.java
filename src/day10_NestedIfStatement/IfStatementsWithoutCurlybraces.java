package day10_NestedIfStatement;

public class IfStatementsWithoutCurlybraces {

    public static void main(String[] args) {


        /*
        if you have to write only 1 statement under else if condition, then you don't need curly braces,
        but if you have more than 1 statements under 1 condition, then have to use curly braces.
        But it's recommended always to use curly braces
         */

        int number = 10;
        String result = "";

        if (number>=1&&number<=12){
            // if the number is valid (1~12)

            if (number==1)
                result="January";
            else if (number==2)
                result="February";
            else if (number==3)
                result="March";
            else if (number==4)
                result="April";
            else if (number==5)
                result="May";
            else if (number==6)
                result="June";
            else if (number==7)
                result="July";
            else if (number==8)
                result="August";
            else if (number==9)
                result="September";
            else if (number==10)
                result="October";
            else if (number==11)
                result="November";
            else
                result="December";



        }else
            result = "Invalid";


        System.out.println(result);



    }

}
