package day35_Encapsulation;

public class CydeoStudent {

    public String name, fieldOfStudy;
    public char gender;
    public int age;
    public int batchNumber;

    public static String schoolName;
    public static String secretCode,programmingLanguage;

    public CydeoStudent(String name, String fieldOfStudy, String programmingLanguage, char gender, int age, int batchNumber) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.programmingLanguage = programmingLanguage;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
    }

    static {
        schoolName="Cydeo";
        secretCode="WoodenSpoon";
        programmingLanguage="Java";
    }

    public static void printProgrammingLanguage(){
        System.out.println("language is "+programmingLanguage);
    }

    public static void printSecretCode(){
        System.out.println("code is "+secretCode);
    }

    public static void printSchoolName(){
        System.out.println("School Name is "+schoolName);
    }

    public void attendClass(){
        System.out.println(name + " attends Class");

    }

    public void study(){
        System.out.println(name + " studies");

    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", schoolName=" + schoolName +
                '}';
    }
}
/**
 * create a class named CydeoStudent
 *             Variables:
 *                 name, gender, age, batchNumber, groupNumber, schoolName,
 *                 fieldOfStudy, programmingLanguage, secretCode
 *
 *             Add a constructor to initialize all the fields
 *
 *             Add a static block to initialize all the statics
 *
 *             methods:
 *                 printSchoolName();
 *                 printSecretCode();
 *                 attendClass():
 *                 study()
 *                 toString()
 */