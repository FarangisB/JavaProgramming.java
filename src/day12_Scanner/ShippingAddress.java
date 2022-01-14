package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your Street name:");
        String streetName = input.nextLine();

        System.out.println("Enter your City name:");
        String cityName = input.nextLine();

        System.out.println("Enter your State:");
        String stateName = input.nextLine();

        System.out.println("Enter your Zip code:");
        String zipCode = input.nextLine();

        System.out.println("Full name = " +fullName);
        System.out.println("Building number = "+buildingNumber);
        System.out.println("Street name = "+streetName);
        System.out.println("City = "+cityName);
        System.out.println("State = "+stateName);
        System.out.println("Zip code = "+zipCode);


        System.out.println(fullName+"\n"+buildingNumber +" "+streetName+"\n"+cityName+", "+
                stateName + " "+zipCode);


        input.close();

    }
}
/*
1. Enter your full name (nextLine())
2. Enter your building number (next())
3. Enter your Street name (nextLine())
4. Enter your city name (nextLine())
5. Enter your state (nextLine())
6. Enter your Zip code (nextLine())

Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012

 */