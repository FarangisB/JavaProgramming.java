package day43_Abstraction_ExceptionsRecap.PersonTask;

public final class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName()+" is testing the application.");
    }

    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours in a day.");
    }

    public void bugReport(){
        System.out.println(getName()+" is creating bug report.");
    }

    public String toString() {
        return "Tester{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + getId() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                "}";
    }
}
