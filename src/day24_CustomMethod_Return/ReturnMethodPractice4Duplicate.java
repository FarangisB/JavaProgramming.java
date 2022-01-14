package day24_CustomMethod_Return;

public class ReturnMethodPractice4Duplicate {

    public static void main(String[] args) {

        String str = "aaabbbbbbccccccddddd";
        str = removeDuplicates(str);
        System.out.println(str);

    }

 // create a method that can remove duplicated chars from the string and returns the new value

 public static String removeDuplicates(String str){
        String result = "";
     for (int i = 0; i < str.length(); i++) {
         char each = str.charAt(i);

         if (!str.contains(""+each)){
             result+=each;
         }
     }
     return result;
 }




}
