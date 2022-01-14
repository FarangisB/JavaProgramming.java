package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

    String str = "fhdgtrkHF^&*(ijokf25561zjhdgh25466@$$%^&*()";

    String digits = "";
    String letters = "";
    String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // reads each character that we have in str
            if (ch>='0'&&ch<='9'){
                digits+=ch;
            }else if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
                letters+=ch;
            }else {
                if(ch!=' '){            // if the special character is not the space
                    specialChars+=ch;
                }

            }

        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChars);

}

}
