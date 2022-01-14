package day36_InheritanceIntro.Incapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Daniel", "MIT", 29, 'F', 'A');
        student1.setAge(39);
        System.out.println(student1);

    }
}
