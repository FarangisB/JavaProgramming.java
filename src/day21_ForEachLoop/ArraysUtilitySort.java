package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtilitySort {

    public static void main(String[] args) {

        // toString() : converts the Array object (single dimensional) to the string

        int [] nums = {1,2,3,4,5};
        System.out.println(nums); // output is --> [I@27f674d bc we didn't call array to the string
                                    // you have to call any array explicitly
        System.out.println(Arrays.toString(nums)); // output is ---> [1, 2, 3, 4, 5]
                                    // you have to call to String any single dimentional data
        System.out.println(nums[0]); // you can print single element
                                    // you have to call to string only when you want to print the whole array

        String word = "Java"; // String method implicitly opens a method
        System.out.println(word);

        System.out.println("________________________________________");

        // sort(array): sorts array in ascending order
        // 0~9
        // a~z
        // A~Z

        int [] scores = {95, 100, 55, 65, 85, 78};
        // if you want to sort arrays elements, you can call to sort method

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores)); // [55, 65, 78, 85, 95, 100]

        System.out.println("Min score:"+ scores[0]); // Min score:55
        System.out.println("Max score:"+ scores[scores.length-1]); // Max score:100

        // if you have letters, not numbers:

        String names [] = {"gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); // [Ahmet, Anna, Maria, Sinema, Zuhal, gunay]

        System.out.println("______________________________________");

        //equals(array1, array2): checks if two arrays are equal, returns boolean

        int arr1[] = {1,3,2};
        int arr2[] = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);    // false

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);   // true

        System.out.println("________________________________");

        char ch1 [] = {'a', 'c', 'b'};
        char ch2 [] = {'b','a', 'c'};  // in order to create anagram condition, we need to sort them

        // Anagram --> listen and silent  -- > when two words are built with the same letters

        Arrays.sort(ch1); // {a, b, c}
        Arrays.sort(ch2); // {a, b, c}

        boolean anagram = Arrays.equals(ch1, ch2);
        System.out.println(anagram);  // true







    }
}
