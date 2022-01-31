package day42_Exceptions_Throw_ThrowsKeywords;

public class DisadvantageOfThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {
        method1();
        method2();
        method3();

        String str = null;
        //System.out.println(str.charAt(0));
        try{
            System.out.println(str.charAt(0));
        }catch (RuntimeException e){
           e.printStackTrace();
        }

    }


    public static void method(){
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws InterruptedException{

        Thread.sleep(3000);
    }

    public static void method2() throws InterruptedException{
        method1();
    }

    public static void method3() throws InterruptedException{
        method2(); // do not use Throws keyword if you will use the method in other place
        Thread.sleep(1000);
    }


}
