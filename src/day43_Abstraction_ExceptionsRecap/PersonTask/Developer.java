package day43_Abstraction_ExceptionsRecap.PersonTask;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName()+" is developing.");
    }

    public void sleep() {
        System.out.println(getName()+" sleeps 6 hours a day.");
    }

    public void unitTest(){
        System.out.println(getName()+" is unit testing.");
    }

    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + getId() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                "}";
    }
}
