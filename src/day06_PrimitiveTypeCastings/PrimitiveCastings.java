package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        //short b = (short)a;

        //what happening in the compile - converts byte to the short (short)a

        int c = b;
        //what happens in the background- compile takes short to the int variable (int)b
        //implicit casting happens automatically and you do not need to write (int) to convert short to int
        //smaller primitive types can be assigned to the larger prim.type automatically


        long d = c;
        //       (long)c

        float e = d;
        double f = e;

        System.out.println("______________________________________________________________________");

        //larger primitive types cannot be directly assigned to the smaller primitive types
        //you have to do it by yourself (from int to byte - int a = 100 to byte byte b = (byte)a)

        // ex:

        int x = 55;
        short y = (short)x;

        System.out.println(x + ":" + y);

        long j = 1000000L;
        short k = (short)j;

        System.out.println(k);
        System.out.println(j+ " : " +k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(m);

        double n = 10.8;
        int s = (int)n; // 10

        System.out.println("_______________________________________________________");

        // shortcut for explicit casting - after sign ; hold button "alt" then hit the "enter" button: alt+enter
        // another way just put the mouse cursor to the red line, push red bulb on the left side, it gives you option cast to short
        double d1 = 20.5;
        short s1 = (short)d1;

        System.out.println(d1 + " : " + s1); // short is for integers, that's why in the console output is 20







    }

}
