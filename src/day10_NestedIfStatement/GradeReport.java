package day10_NestedIfStatement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 135;

        if (score>=0&&score<=100){ // if condition is valid
            // it means 1 condition evaluates 5 possibilities

            if (score>=90){ // no need to write "if the score is <=100", bc this condition already is checked in the 1st if statement
                System.out.println("Excellent");
            }else if (score>=80){ // if this condition is false, it means the score is <80
                System.out.println("Great");
            }else if (score>=70){ // if this condition is false, it means the score is <70
                System.out.println("Good");
            }else if (score>=60){ // if this condition is false, it means the score is <60
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }

        }else { // if the score is Not Valid
            System.out.println("Invalid Score");
        }

        System.out.println("______________________________________________________________");

        String result = ""; // temporarily

        if (score>=0&&score<=100){ // if condition is valid
            // it means 1 condition evaluates 5 possibilities

            if (score>=90){ // no need to write "if the score is <=100", bc this condition already is checked in the 1st if statement
                result="Excellent";
            }else if (score>=80){ // if this condition is false, it means the score is <80
                result="Great";
            }else if (score>=70){ // if this condition is false, it means the score is <70
                result="Good";
            }else if (score>=60){ // if this condition is false, it means the score is <60
                result="Passed";
            }else {
                result="Failed";
            }

        }else { // if the score is Not Valid
            result="Invalid Score";
        }

        System.out.println(result);



        /*
        90~100: excellent
        80~89: Great
        70~79: Good
        60~69: Passed
        0~59: Failed
         */


    }

}
