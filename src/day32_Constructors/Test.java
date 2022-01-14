package day32_Constructors;

public class Test {

    public Test(){ //A
        System.out.println("A");
    }

    public void Test(int a){ //A  B
        //this();
        System.out.println("B");
    }

    //public Test(double a){ //A B C
        //this(10);

        //System.out.println("C");
    //}

    //public void Test(String str){ // A B C D
        //this(2.5);
        //System.out.println("D");
    //}

    public static void main(String[] args) {
        Test obj = new Test();

    }
}
