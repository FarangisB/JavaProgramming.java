package practice_12_29_2021;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        String[] scrum1 = {"Aysegul", "Timur", "Oleksandr", "Jilili"};

        String[] scrum2 = {"Ali", "Olga"};

        String[] scrum3 = {"Sergei", "Yuliya", "Farangez"};

        String[][] scrumTeams = {{"Aysegul", "Timur", "Oleksandr", "Jilili"}, {"Ali", "Olga"}, {"Sergei", "Yuliya", "Farangez"}};

        System.out.println(Arrays.deepToString(scrumTeams));

        System.out.println(scrumTeams[1][1]); // Olga




    }
}

/**
 * int i = 0;
 *         for (int each : array) {
 *             if (each>0){
 *                 result[i]+=each;
 *                 i++;
 *             }
 *         }
 */
