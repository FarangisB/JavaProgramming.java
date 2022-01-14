package day11_Switch_Scanner;

public class Grade2_IfYouHaveOnly2ResultsForDifferentGrades {

    public static void main(String[] args) {

        char ch = 'F';
        String result="";

        //if you want every grade to print Passed, then:
        switch(ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                //System.out.println("Passed");
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                //System.out.println("Invalid");
                result="Invalid";


        }

        System.out.println(result);







    }



}
