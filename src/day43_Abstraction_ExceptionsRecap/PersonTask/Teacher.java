package day43_Abstraction_ExceptionsRecap.PersonTask;

public final class Teacher extends Employee{


    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName()+" is teaching.");
    }

    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours a day.");
    }

    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + getId() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                "}";
    }
}
