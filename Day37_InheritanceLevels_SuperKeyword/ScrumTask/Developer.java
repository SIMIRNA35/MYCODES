package Day37_InheritanceLevels_SuperKeyword.ScrumTask;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, String jobTitle, int Id, double salary, String companyName) {
        super(name, age, gender, jobTitle, Id, salary, companyName);
    }
    public void fixBugs(){
        System.out.println(jobTitle + " " + name + "is crying" );
    }
}
