package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (result.contains(each)){
                continue;
            }
            result.add(each);
        }

        System.out.println("result = " + result); // result = [10, 20, 30]

        System.out.println("_______________________");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        System.out.println(list1==list2); // false bc they are both new objects
        System.out.println(list1.equals(list2)); // true, bc the objects have the same element

        System.out.println("_______________________________");

        list1.clear();

        boolean r4 = list1.isEmpty();

        System.out.println(r4);        // true

        System.out.println("_______________________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        // bulk operation: CollectionType

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);  // [1, 2, 3, 4, 5, 6, 7]





    }

}
