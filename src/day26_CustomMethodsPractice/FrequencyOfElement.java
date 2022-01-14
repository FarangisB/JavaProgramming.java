package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int [] array = {1,1,1,1,2,5,3,4,6};
        int frequency = frequencyOfElement(array, 1);
        System.out.println(frequency);

        System.out.println("__________________");

        char []chars = {'v', 'v', 'b'};
        int frequency1 = frequencyOfElement(chars, 'v');
        System.out.println(frequency1);


    }

    // returns the frequency of the given int element from the given int array
    public static int frequencyOfElement(int [] array, int element){
        int frequency =0;
        for (int each : array) {
            if (each==element){
                frequency ++;
            }

        }
        return frequency;
    }

    // returns the frequency of the given double element from the given double array
    public static double frequencyOfElement(double [] array, double element){
        int frequency =0;
        for (double each : array) {
            if (each==element){
                frequency ++;
            }

        }
        return frequency;
    }

    // returns the frequency of the given char element from the given char array
    public static int frequencyOfElement(char [] array, char element){
        int frequency =0;
        for (char each : array) {
            if (each==element){
                frequency ++;
            }

        }
        return frequency;
    }

    // returns the frequency of the given String element from the given String array
    public static int frequencyOfElement(String [] array, String element){
        int frequency =0;
        for (String each : array) {
            if (each.equals(element)){
                frequency ++;
            }

        }
        return frequency;
    }
    

    }


