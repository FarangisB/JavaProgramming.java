package day14_String;

public class StringMethod3UsingSubStringMethod {

    public static void main(String[] args) {

        // substring method(beginning index, ending index) ==> creating a sub value of the String
        // in substring method the ending index is always excluded
        // substring method creates substring starting from the beginning index till the given ending index
        // substring (beginningIndex) ==> creates substring starting from the given beginning index till the end of th string

        // example:
        String word = "Cydeo School";
        //              01234567891011 // we need to create a substring of the String
        String brand = word.substring(0,4+1);

        System.out.println("brand = " + brand);

        String str1 = word.substring(6); // if there is other words in String, you need to include ending index.
                                            // but if there is no other words, you don't have to include ending index

        System.out.println("str1 = " + str1);

        System.out.println("________________________________________");


        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" ") );
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" ") );
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);




    }
}
