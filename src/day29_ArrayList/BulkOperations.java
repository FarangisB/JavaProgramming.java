package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        /*  Bulk Operations
                addAll(CollectionType) => in order to use this method you need to call Arrays.asList method
                removeAll(CollectionType) => removes all the matching elements from the list as many they appeared in the list
                retainAll(CollectionType) => keeps given elements in the list and removes all non-matched elements from the list
                containsAll(CollectionType)
         */

        // addAll
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list);  // [1, 2, 3, 4, 5, 6, 7]

        System.out.println("______________________");

        // removeAll
        list.removeAll(Arrays.asList(3,5,8)); // you do not specify an index, you specify an element

        System.out.println(list); // [1, 2, 4, 6, 7]

        System.out.println("_______________________");

        // retainAll
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers); // [100, 200, 300, 100, 200, 300]

        System.out.println("_______________________");

        ArrayList<String> jobTiles = new ArrayList<>();
        jobTiles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master"));

        jobTiles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTiles);  // [QA, SDET, QA, SDET]

        System.out.println("______________________________");

        // containsAll
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = nums.contains(10); // verifies if the list contains element

        boolean r2 = nums.contains(2)&&nums.contains(5)&&nums.contains(10);

        System.out.println("r1 = " + r1); // r1 = true
        System.out.println("r2 = " + r2); // r2 = true

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));

        boolean r4 = nums.containsAll(Arrays.asList(2,5,100));

        System.out.println("r3 = " + r3); // r3 = true
        System.out.println("r4 = " + r4); // r4 = false => bc list doesn't contain 100

        System.out.println("__________________________");

        String [] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        System.out.println(Arrays.toString(names)); // [Josh, Jack, Daniel, Shay, Breanna]

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        System.out.println("namesList = " + namesList); // [Josh, Jack, Daniel, Shay, Breanna]

        // we can use this method only if we have non-primitive type

        System.out.println("__________________________________________");

     /*   int [] arr = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

      */

        Integer [] arr = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("__________________________");

        // there is no method which returns primitives to the arrayList, but you can create one yourself

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);


    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }

    }




