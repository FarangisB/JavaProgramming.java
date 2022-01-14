package day20_Arrays;

public class FindingTheMidNumberOfArray {

    public static void main(String[] args) {

        int []numbers = {10, 5, 4, 20, 1, 0};
        int min = numbers[0];
        int max = numbers[0];
        int mid = numbers[0];

        for (int i = 0; i < numbers.length; i++) { // shortcut for array for loop - numbersfori
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<max&&numbers[i]>min){
                mid = numbers[i]/2;
            }

        }

        System.out.println(mid);
    }
}
