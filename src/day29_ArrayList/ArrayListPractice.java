package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        String [] countries = {"Japan", "Korea", "United States", "Turkey", "Tajikistan", "United Kingdom"};

        // converting array to arrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf( p -> p.length()>=10);

        // converting arrayList to array

        list.toArray(new String[0]); // doesn't matter which number you'll give to array, bc later it takes the size of list

        countries=list.toArray(new String[0]); // re-assigning array list to arrays

        System.out.println(Arrays.toString(countries)); // [Japan, Korea, Turkey]





    }
}
/**
 1. create an Array of String called countries
 2. write a program that can remove all the country names that have length of 10 or greater
 **/
