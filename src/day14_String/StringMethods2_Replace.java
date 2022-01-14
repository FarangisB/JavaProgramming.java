package day14_String;

public class StringMethods2_Replace {

    public static void main(String[] args) {

        // replace() method ==> replaces the old value to the new

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); // returns to "Python is fun, I love learning Python

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        System.out.println("_________________________________________________________");

        // example:

        String email = "JohnSmith@yahoo.com";
        // email.replace("yahoo", "gmail"); ==> in order to replace the old object you have to create a new String object
        email=email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        System.out.println("_________________________________________________");

        // example with replace method

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "");
        sentence2 = sentence2.replace("   ", " "); // here we replaced 3 white spaces to one

        System.out.println("sentence2 = " + sentence2);

        System.out.println("_____________________________________________________________");

        String s = "Dog Dog Dog Dog Dog Dog";
        s=s.replace("Dog", "Cat"); //you have to assign back in order to replace the word

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2=s2.replace(" C#", " Java"); // in order to replace only second C# , we made the object unique by adding space
                                                    // but you have to put space again in replacement object
        System.out.println("s2 = " + s2);

        String s3 = "Java";
        s3=s3.replace("a", "e"); // output: "Jeve"

        System.out.println("s3 = " + s3);

        System.out.println("__________________________________________");

        //*** replaceFirst method ==> (oldValue, newValue) what is coming first

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");

        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2=result2.replaceFirst("C#", "Java");

        System.out.println("result2 = " + result2);




    }

}
