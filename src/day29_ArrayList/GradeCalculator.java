package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~ 100
        gradeOfA.removeIf(p-> !(p >=90 && p<=100));
        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf(p-> !(p >=80 && p<=89));
        System.out.println(gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf(p-> !(p >=70 && p<=79));
        System.out.println(gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf(p-> !(p >=60 && p<=69));
        System.out.println(gradeOfD);

        ArrayList<Integer> gradeOfE = new ArrayList<>(scores); // 0 ~ 59
        gradeOfE.removeIf(p-> !(p >=0 && p<=59));
        System.out.println(gradeOfE);

        System.out.println("gradeOfA = " + gradeOfA.size());
        System.out.println("gradeOfB = " + gradeOfB.size());
        System.out.println("gradeOfC = " + gradeOfC.size());
        System.out.println("gradeOfD = " + gradeOfD.size());
        System.out.println("gradeOfE = " + gradeOfE.size());




    }
}
/**
 * Given the following arraylists:
 *         ArrayList<Integer>  scores = new ArrayList<>();
 *           scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
 *
 *
 *           ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
 *         ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
 *         ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
 *         ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
 *         ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
 *
 *
 *         Write a program that can count the total numbers of grade A, B, C, D and F
 */
