package practice_12_15_2021;

public class CompareLoops {

    public static void main(String[] args) {

        int num = 10;
        int count=0;
        for (int i = num; i < 5; i++) {
            System.out.println("Hello batch-25   For loop");
        }

        System.out.println("________________________________");

        if (num>5){
            System.out.println("Hello Batch-25  If");
        }

        System.out.println("________________________________");

        while (num>5){
            System.out.println("Hello Batch-25  While Loop");
            num--;

        }

        System.out.println("________________________________");

        do {
            System.out.println("Hello Batch-25  Do-While Loop");
        } while (num>5);


    }
}
