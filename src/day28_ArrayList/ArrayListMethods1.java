package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        // add method
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.add(2, 25);
        numbers.add(5, 45);

        System.out.println(numbers);

        System.out.println("______________________");



        // size method
        System.out.println( numbers.size() );

        System.out.println("_______________________");

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        System.out.println("_______________________");



        // get method
        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("________________________");




        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("________________________");



        // set method
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list); // [Java, Python, Java, C#, Ruby]

        list.set(2, "JavaScript"); // this method just replaces old element in the index 2 to the new element

        System.out.println(list); // [Java, Python, JavaScript, C#, Ruby]

        System.out.println("____________________________");




        // remove method
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);   // [Suat, Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);

        System.out.println(employees);   // [Aygun, Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);

        System.out.println(employees);   // [Olga, Neira, Ali, Hulya, Kaloyan]

        employees.remove(0);

        System.out.println(employees);   // [Neira, Ali, Hulya, Kaloyan]

        employees.remove(1);

        System.out.println(employees);   // [Neira, Hulya, Kaloyan]

        employees.remove(employees.size()-1);

        System.out.println(employees);   // [Neira, Hulya]

        //employees.remove("Hulya");

        //System.out.println(employees);   // [Neira]

        //employees.remove("Neira");

        //System.out.println(employees);   // []

        boolean r1 = employees.remove("Hulya");

        System.out.println(r1);            // true

        boolean r2 = employees.remove("Neira");

        System.out.println(r2);            // true




    }
}
