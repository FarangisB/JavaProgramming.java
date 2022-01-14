package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        /* double hourlyRate = 50;
        double weeklyHours = 45;
        double stateTax = 6; //(given as percentage, you need to convert to decimal)
        double federalTax = 26; //(given as percentage, you need to convert to decimal)

         */

        int hourlyRate = 65,
                weeklyHours = 40;

        double stateTaxRate = 0,
                federalTaxRate = 26.2;

        // ______________________________________

        int salaryBeforeTax = hourlyRate * weeklyHours*52;
        double stateTax = salaryBeforeTax*stateTaxRate/100;
        double federalTax = salaryBeforeTax*federalTaxRate/100;
        double totalTax = stateTax = federalTax;
        double salaryAfterTax = salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $" + salaryAfterTax);
        System.out.println("State tax = $" +stateTax);
        System.out.println("Federal tax = $" + federalTax);
        System.out.println("Total Tax = $" + totalTax);
        System.out.println("Salary after tax = $" + salaryAfterTax);




    }




}
