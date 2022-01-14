package day15_StringMethodsAndLoop;

public class StartsWithMethod {

    public static void main(String[] args) {

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden"); // the way to ignore case sensitivity in startswith method
                        // we first create the lower/upper case version of string and then compare the words

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }


}
