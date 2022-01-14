package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list); // [1, 1, 2, 3, 3, 4, 5, 5]

        for (Integer element : list) {
            int frequency = 0;
            for (Integer each : list) {
                if (each==element){
                    frequency++;
                }
            }

            if (frequency==1){
                System.out.println(element);
                break;
            }
        }




    }
}
