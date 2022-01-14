package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {

nameOfMonth(15);
System.out.println("Hello World"); // here the exp. ==> only nameOfMonth got executed, not Hello World statement


    }

    //Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number) {

        if (number < 1 || number > 12) { // if you use return statement inside the void, you can use it only to exit the method
            System.out.println("Invalid");
           // return; // exits method
            System.exit(0); // if you use exit method instead of using return, after the result reaches condition the hole system exits, not only the method
        }
        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" :
                (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun" :
                        (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" :
                                (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";

        System.out.println("Month name = " + name);


    }


}
