package day12_Scanner.day19_LoopPractices;
public class Duplicate {
    public static void main(String[] args) {

        String str="aabccdeeef";
        String result= "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length() ; j++) {
                char each1 = str.charAt(j);
                if (each == each1) {
                    count++;
                }
            }
            if (count>1) {
                result += each;
                break;
            }
        }
        System.out.println(result); // here we found first duplicated char








    }

}
