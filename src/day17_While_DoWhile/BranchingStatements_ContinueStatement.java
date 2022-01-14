package day17_While_DoWhile;

public class BranchingStatements_ContinueStatement {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {
            // if (i=='C'){  --> you can use this way, but in this case it will stop executing, or...
                //break;

            if (i=='C'){ // continue is used to skip a given data
            continue;

            }
            System.out.println(i);

        }


    }
}
