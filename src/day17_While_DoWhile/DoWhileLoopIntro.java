package day17_While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;

        while (a){ // with while loop if the condition is not match, the statement never will be executed
            System.out.println("Wooden Spoon");
        }

        System.out.println("_______________________________");

        do {  // with do while loop if the condition is not match, the statement will be executed
            System.out.println("Wooden Spoon");
        }
        while (a);


    }
}
