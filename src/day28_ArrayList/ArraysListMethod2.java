package day28_ArrayList;

import java.util.ArrayList;

public class ArraysListMethod2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);   // [100, 200, 200, 200, 300, 400, 500]
    /*    int num = 1;     // it is int so it removes the element at the index 1
        list.remove(num);

     */

        System.out.println(list);   // [100, 200, 200, 300, 400, 500]

        Integer num = 200;       // it is Wrapper class so it removes the element that is shown
        list.remove(num);        // you can not put 200 inside the remove, it removes the index in 200
        System.out.println(list);   // [100, 200, 200, 300, 400, 500]

        boolean r = list.remove(num);

        Integer num1 = 2000;
        boolean r2 = list.remove(num1);

        System.out.println(r);    // true  // removes and says it is removed
        System.out.println(r2);   // false // didn't find the element
        System.out.println(list);  // [100, 200, 300, 400, 500]

        System.out.println("__________________________");

        System.out.println(list.size());  // 5

        list.clear();

        System.out.println(list.size());  // 0
        System.out.println(list);         // []

        System.out.println("___________________________");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); // return you to an int and shows the first index of chars
        int b = characters.lastIndexOf('A');  // // return you to an int and shows the last index of chars

        System.out.println(a);          // 0
        System.out.println(b);          // 4

        System.out.println("_________________________________");

        boolean r3 = characters.contains('A');
        boolean r4 = characters.contains('B');

        System.out.println(r3);         // true
        System.out.println(r4);         // false








    }
}
