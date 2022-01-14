package day20_Arrays;

public class FindingTheMinNumberOfArray {

    public static void main(String[] args) {

        int []numbers = {10, 5, 4, 20, 1, 0};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) { // shortcut for array for loop - numbersfori
            if (numbers[i] < min) { // if there is an element in the array that is less than the current min number
                min = numbers[i]; // assigning less number to min
            }

        }

        System.out.println(min);
    }


}
