package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";
        int skippedChars = 0; // you can also create a variable to collect deleted chars

        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i); // "A", "A", "B", "B", "C", "C"
            if (result.contains(ch)){ // if the result already contains char
                skippedChars ++; // this is a container for deleted chars
                continue;              // the next one will be skipped
            }
            result+=ch;
        }

        System.out.println(result);
        System.out.println(skippedChars);
    }
}
