package day10_NestedIfStatement;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        // how to use Ternaries in Nested If

        int score = 50;

       /* if (score>=0&&score<=100){

            if (score>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else
            System.out.println("Invalid score");

        */

        String result = (score>=0&&score<=100)?(score>=60)?"Passed":"Failed":"Invalid Score";
        System.out.println(result);

//it's not recommended to use ternaries with the nested If


    }



}
