package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String words[] = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cydeo"};

        int count = 0;

        for (String element : words) {
            if (element.equals("Layan")){
                count++;
            }
        }
        System.out.println(count); // 2

        System.out.println("___________________________");

        for (String each : words) {
            int frequency=0;

            for (String element : words) {
                if (element.equals(each)){
                    frequency++;
                }
            }

            if (frequency==1){           // in order to find the unique element
                System.out.println(each);
            }
        }





    }
}

