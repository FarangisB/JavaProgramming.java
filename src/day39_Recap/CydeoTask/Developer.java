package day39_Recap.CydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName()+" the "+getJobTitle()+" is coding");
    }

    public void fixingBugs() {
        System.out.println(getName()+" the "+getJobTitle()+" is fixing a bug");
    }
}
/**
 *  4. Create a sub class of Employee named Developer
 *
 *             Override the work method
 *
 *             Extra methods:
 *                 fixingBugs()
 */
