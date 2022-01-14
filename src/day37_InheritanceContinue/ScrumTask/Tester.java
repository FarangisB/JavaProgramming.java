package day37_InheritanceContinue.ScrumTask;

public class Tester extends Employee{ // Tester Is A Employee

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void creatTicket(){
        System.out.println(name+" "+jobTitle+" is creating ticket");
    }
}
