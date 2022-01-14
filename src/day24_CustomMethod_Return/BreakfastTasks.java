package day24_CustomMethod_Return;

import java.util.Locale;

public class BreakfastTasks {

    public static void main(String[] args) {

        initialsOfThePerson("Farangis", "Bayzaeva");

        domain("Cydeo@amazon.com");

        nameOfMonth(5);

        nameOfDay(7);

        ageGroup(65);

    }


//Create a method that can display the initials of the person

    public static void initialsOfThePerson (String firstName, String lastName){
       String initial = firstName.charAt(0)+"."+lastName.charAt(0)+".";
       initial = initial.toUpperCase();
        System.out.println(initial);

        System.out.println("________________________");


    }

//Create a method that can display the domain of the email

    public static void domain (String email){

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    //Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth (int number){
        String name = "";
        if (number>=1&&number<=12){
            name = (number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":
                    (number==4)?"Apr":(number==5)?"May":(number==6)?"Jun":
                            (number==7)?"Jul":(number==8)?"Aug":(number==9)?"Sep":
                                    (number==10)?"Oct":(number==11)?"Nov":
                                            "Dec";

        }else {
            name="Invalid";
        }

        System.out.println("Month name = "+name);

    }

//Create a method that can print the name of the day based on the given number to the method


    public static void nameOfDay(int number){
        String name = "";
        if (number>=1&&number<=7){
            name = (number==1)?"Monday":(number==2)?"Tuesday":
                    (number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Friday":
                            (number==6)?"Saturday":"Sunday";
        }else {
            name = "Invalid number";
        }

        System.out.println("The name of the day is "+name);

    }

/**
 * Create a class called AgeGroups, and write a program that can define the age groups of a person
 *
 *    age groups are:
 *    infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
 *    Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
 *    Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
 *    Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
 *    Senior Citizen (75 - 84),
 *    Old Senior Citizen (85+)
  */

    public static void ageGroup(int age){
        String group="";
        if (age>=1&&age<=120){
            group = (age>=1&&age<=2)?"Infant":(age>=3&&age<=5)?"Toddler":
                    (age>=6&&age<=9)?"Kid":(age>=10&&age<=12)?"Pre-Teen":
                    (age>=13&&age<=17)?"Teenager":(age>=18&&age<=20)?"Young Adult":
                    (age>=21&&age<=39)?"Adult":(age>=40&&age<=49)?"Young Middle-Aged Adult":
                    (age>=50&&age<=54)?"Middle-Aged Adult":(age>=55&&age<=64)?"Very Young Senior Citizen":
                    (age>=65&&age<=74)?"Young Senior Citizen":(age>=75&&age<=84)?"Senior Citizen":
                    "Old Senior Citizen";
        }else{
            group = "Invalid age";
        }

        System.out.println("You are in the age Group ="+group);
    }



}
