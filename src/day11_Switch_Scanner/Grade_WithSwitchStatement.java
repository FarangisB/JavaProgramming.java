package day11_Switch_Scanner;

public class Grade_WithSwitchStatement {

    public static void main(String[] args) {

        char ch = 'B';
        String result="";

        switch(ch){
            case 'A':
                //System.out.println("Excellent");
                result="Excellent";
                break;
            case 'B':
                //System.out.println("Great job");
                result="Great job";
                break;
            case 'C':
                //System.out.println("Good");
                result="Good";
                break;
            case 'D':
                //System.out.println("Passed");
                result="Passed";
                break;
            case 'E':
                //System.out.println("Failed");
                result="Failed";
                break;
            default:
                //System.out.println("Invalid");
                result="Invalid";

        }

        System.out.println(result);


    }


}
/*
A char variable named grade is given. Use switch statement to print the following messages:
'A': excellent
'B':great job
'C':good
'D':passed
'E':failed
other wise: invalid
 */