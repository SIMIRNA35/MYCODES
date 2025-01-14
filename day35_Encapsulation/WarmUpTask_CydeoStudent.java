package day35_Encapsulation;

public class WarmUpTask_CydeoStudent {

    public String name;
    public char gender;
    public int age , batchNumber, groupNumber ;

    public static String schoolName ;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode ;

    public WarmUpTask_CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber,
                                   String fieldOfStudy, String programmingLanguage, int secretCode) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy; }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java" ;
        secretCode = "Wooden Spopone";


    }

    public static void  printSchoolName(){
        System.out.println("The school name is" + schoolName);

    }
    public static void  printSecretCode() {
        System.out.println("The secret code is" + secretCode);
    }
    public void attendClass(){
        System.out.println(name + " is attending class. ");
    }
    public void studying(){
        System.out.println(name + " is studying. "); }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                 ", fieldOfStudy='" + fieldOfStudy + '\''+
                ", schoollname ='" + schoolName + '\''+
                ", secretcode='" + secretCode + '\''+
                '}';
    }
}
/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

 */