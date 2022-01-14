package day24_CustomMethod_Return;

public class ReturnMethodPractice3Frequency {

    public static void main(String[] args) {

        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));
// here we re-used function to solve another task, which is to find the unique char

            if (frequency==1){
                System.out.println(str.charAt(i));
            }
        }

    }

    public static int frequency(String str, char ch) {

        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }

        }
        return count;
    }


}
