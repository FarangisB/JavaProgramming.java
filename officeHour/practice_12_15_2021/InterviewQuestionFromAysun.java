package practice_12_15_2021;

public class InterviewQuestionFromAysun {

    public static void main(String[] args) {

        String str = "abc";// you can use any string ///
        int leng = str.length();
        int len = leng / 2;
        char chr = ' ';
        String str1 = "";
        System.out.println(leng);

        if (str.length()==3){
            if(str.charAt(0) == str.charAt(2)){
                System.out.println(str);
            }
        } else
            for (int i = 0, j = leng - 1; i < len; i++, j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    chr = str.charAt(i);
                    str1 += chr;
                }
            }
        System.out.println(str1);

    }
}








/**
 *  Given a string, look for a mirror image (backwards) string at both the
 *  beginning and end of the given string.
 *            In other words, zero or more characters at the very begining
 *            of the given string, and at the very end of the
 *            string in reverse order (possibly overlapping). For example,
 *            the string "abXYZba" has the mirror end "ab".
 *
 *                   mirrorEnds("abXYZba") → "ab"
 *                   mirrorEnds("abca") → "a"
 *                   mirrorEnds("aba") → "aba"
 */
