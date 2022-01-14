package day15_StringMethodsAndLoop;

public class AlphabetLoop {

    public static void main(String[] args) {

        // A~Z ====> 65~90
        for (int i = 65; i<=90; i++){
            System.out.print((char)i+" ");
        }
        System.out.println();

        System.out.println("______________________");

        for (char i = 'A'; i<='Z'; i++){
            System.out.print(i+" ");
        }

        System.out.println( );

        System.out.println("________________________");

        // a~z
        for (char i = 'a'; i<='z'; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("__________________________");

        // Z~A

        for (char i = 'Z'; i>='A'; i--){
            System.out.print(i+" ");
        }

        System.out.println( );

        System.out.println("________________________");

        // z~a
        for (char i = 'z'; i>='a'; i--){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("________________________");

        //for (char i = 1; i<=40000; i++){
            //System.out.print(i+" ");
        //}


    }
}
