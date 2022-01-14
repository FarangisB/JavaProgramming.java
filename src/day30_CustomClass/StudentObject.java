package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');

        Student student2 = new Student();
        student2.setInfo("Farangis", 'F', 34, 3341, 'B');

        Student student3 = new Student();
        student3.setInfo("Farangez", 'F', 32, 6956, 'A');

        Student student4 = new Student();
        student4.setInfo("Edison", 'M', 32, 4898, 'B');

        Student student5 = new Student();
        student5.setInfo("Kerem", 'M', 36, 8108, 'A');


        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("____________________________________");

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade=='A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);




    }


}