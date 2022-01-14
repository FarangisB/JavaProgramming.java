package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

  // create a function that can calculate the grade
  /* then check the grade:
        'A' = Excellent
        'B' = Great
        ....
   */
        String str1 = grade(110); // in order to re-use it we have to return it to new string

        if (str1.equalsIgnoreCase("A")){
            System.out.println("Excellent");
        }else if(str1.equalsIgnoreCase("b")){
            System.out.println("Great");
        }else if (str1.equalsIgnoreCase("c")){
            System.out.println("Good");
        }else if(str1.equalsIgnoreCase("d")){
            System.out.println("Passed");
        }else if (str1.equalsIgnoreCase("F")){
            System.out.println("Try again");
        }


    }

    public static String grade(int score){

        String result ="";

        if (score<0||score>100){  //invalid
            result="Invalid";

        }else {  // valid
            result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";

        }

        return result;

    }




}
