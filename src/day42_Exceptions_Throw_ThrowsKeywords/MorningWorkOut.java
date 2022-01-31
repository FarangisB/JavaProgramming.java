package day42_Exceptions_Throw_ThrowsKeywords;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("________Push Up Started______________");

        for (int i = 1; i <=30 ; i++) {

            System.out.print("\rPush up "+i);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n________Push Up Completed______________");

        System.out.println("________Pull Up Started______________");

        for (int i = 1; i <=20 ; i++) {

            System.out.print("\rPull up "+i);

            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n________Pull Up Completed______________");


    }

    // it's better to create your own sleep method in order to not handle Thread.sleep every time and use
    // seconds instead of milliseconds
    public static void sleep(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
