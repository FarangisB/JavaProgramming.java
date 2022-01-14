package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        // hourlyRate, weeklyHours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfweeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfweeks;

        // System.out.println(salary);

        // shortcut for any variable:
        // - soutv - then choose what kind of variable you need

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = " + numberOfweeks);
        System.out.println("salary = $" + salary);

        /*
         if you need to calculate another employees salary, you can just
         change numbers
         */


    }

}
