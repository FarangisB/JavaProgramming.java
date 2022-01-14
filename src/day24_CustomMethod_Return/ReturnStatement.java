package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {
        nameOfDay(10);

        System.out.println("_____________________");

        nameOfMonth(9);


    }

// Create a method that can print the name of the day based on the given number
// to the method

    public static void nameOfDay(int number) {

        if (number < 1 || number > 7) {
            System.out.println("Invalid");
            return; // return inside of void method exits the method if the number is invalid
        }

        String name = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" :
                (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday" :
                        (number == 6) ? "Saturday" : "Sunday";
        System.out.println(name);
    }

//Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number) {

        if (number < 1 || number > 12) { // if you use return statement inside the void, you can use it only to exit the method
            System.out.println("Invalid");
            return; // exits method
        }
        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" :
                (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun" :
                        (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" :
                                (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";

        System.out.println("Month name = " + name);


    }

}
