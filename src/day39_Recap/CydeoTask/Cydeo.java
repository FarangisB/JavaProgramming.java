package day39_Recap.CydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Magda", 29, 'F', 2256, "Developer", 150000);

        Tester tester = new Tester("Farangis", 34, 'F', 3341, "SDET", 130000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 2546, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);

        System.out.println("___________________________________");

        developer.setAge(39);

        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("___________________________________");

        developer.work();
        teacher.work();
        tester.work();

        System.out.println("_____________________________________");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("______________________________________");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();

        System.out.println("______________________________________");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("______________________________________");

        student.eat();
        student.drink();
        student.sleep();

        student.study();



    }
}
