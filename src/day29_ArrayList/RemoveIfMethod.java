package day29_ArrayList;

import utilities.StringUtulity;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

    /*    for (int i = 0; i < list.size(); i++) {

        }

     */
                // Lambda expression
        list.removeIf(  p  -> p <5);  // p is a variable name, it can be called how you want

        System.out.println(list); // [5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]

        System.out.println("__________________________");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(  each  ->  each%2==0); // after an arrow you need to put a boolean expression

        System.out.println(list2); // [1, 3, 5, 7, 9]

        System.out.println("__________________________");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(p -> p.startsWith("J"));

        System.out.println(list3); // [Python, C#, C++]

        System.out.println("__________________________");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "Cydeo"));

        names.removeIf( name -> ! StringUtulity.isPalindrome(name));

        System.out.println(names); // [Anna, Racecar, Level, Eye]




    }
}
