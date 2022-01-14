package day08_IfStatements;

public class quiz {


    public static void main(String[] args) {

        long a = 3000L;
        double b = (float)a;
        int c = (short)b;
        System.out.println(c%1000);

        int d = 3,  f = 2;

        long e = (d+f) * 2 / 3 % 2 ;

        System.out.println(e);

        float    aa   =  100.987_6543f;

        short  bb  =  (byte) aa ;

        byte  cc   = (byte) bb;

        System.out.println(cc);

        long  aaa = 30L;

        long  bbb= (short) aaa;

        System.out.println(bbb);

        System.out.println("5+2=" + 3+4);
        System.out.println("5+2=" +(3+4));


    }
}
