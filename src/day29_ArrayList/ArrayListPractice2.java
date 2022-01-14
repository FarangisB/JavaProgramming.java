package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        // requirements: keep names Ahmed and David and remove others
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David"));

        employees.retainAll(Arrays.asList("Ahmed", "David")); // [David, Ahmed, Ahmed, David]

        System.out.println(employees);

        System.out.println("___________________________________________");

        // requirements: remove all names that start with letter M
        String [] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf( p -> p.charAt(0)=='M');

        System.out.println(list);  // [Sumeyra, Hasan, Beril]

        names = list.toArray(new String[0]); // if task requires to return the result to an array, this is how you will do

        System.out.println(Arrays.toString(names)); // [Sumeyra, Hasan, Beril]






    }
}