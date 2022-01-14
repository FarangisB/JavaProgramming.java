package day17_While_DoWhile;

public class LoopPractices_ConvertLoops {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { // for counting numbers when you know the max count, for loop is the best solution but not the only one
            System.out.println(i);
        }

        System.out.println("___________________________________");

        int num = 1; // in while loop you can not inisialisation inside the loop and the itration must be after the execution
        while (num<=10){
            System.out.println(num);
            num++; // --> iteration
        }

        System.out.println("____________________________________");

        int num2 = 1;
        do{
            System.out.println(num2);
            num2++;
        }while (num2<=10);

    }
}
