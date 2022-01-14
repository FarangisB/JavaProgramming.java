package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0; // it is a container for deleted words

        while (str.toLowerCase().contains("java")||str.toUpperCase().contains("JAVA")){
            str = str.replaceFirst("Java", "");// we use replaceFirst method bc we want it to be deleted one by one,not all in one time
            // with replace method we are deleting the word one by one and counting how many times we're deleting the word

            frequency++;
        }

        System.out.println(frequency);

        System.out.println("__________________________________");

        String sentence = "cat cat cat cat cat dog dog dog";
        int countCat = 0;
        while (sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);

        System.out.println("__________________________________");

        // how we can use 1 while loop to count the frequency for 2 words?

        String str1 = "Java Java Python Python";

        int countJava = 0;
        int countPython = 0;

        while (str1.toLowerCase().contains("java")&&str1.toUpperCase().contains("JAVA")||
                str1.toLowerCase().contains("python")&&str1.toUpperCase().contains("PYTHON")){

            if (str1.toLowerCase().contains("java")||str1.toUpperCase().contains("JAVA")){
                str1 = str1.replaceFirst("java", "");
                countJava++;
            }
            if (str1.contains("python")) {
                str1 = str1.replaceFirst("python", "");
                countPython++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }
}
