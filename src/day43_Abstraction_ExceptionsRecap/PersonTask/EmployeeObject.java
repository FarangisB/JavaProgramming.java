package day43_Abstraction_ExceptionsRecap.PersonTask;

public class EmployeeObject {

    public static void main(String[] args) {

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(teacher);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();
        System.out.println("-------------------------------");

        developer.work();
        developer.sleep();
     // developer.bugReport(); it's testers method
        developer.eat();
        developer.unitTest();
        System.out.println("-------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();
        System.out.println("-------------------------------");

        driver.work();
        driver.eat();
        driver.sleep();


    }
}
