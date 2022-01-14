package day20_Arrays;

public class FindingTheMaxNumberOfArray {

    public static void main(String[] args) {

        int []numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0]; // assume that the first element is the greatest
        // in order to find the max number we have to compare this number with every
        // single element of this array

        for (int i = 0; i < numbers.length; i++) { // shortcut for array for loop - numbersfori
            if (numbers[i]>max) { // if there is an element in the array that is greater than the current max number
                max = numbers[i]; // assigning greater number to max
            }


        }
        System.out.println(max);





    }
}
