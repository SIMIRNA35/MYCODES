package Day37_InheritanceLevels_SuperKeyword.ScrumTask;

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(String name, int age, char gender, int Id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", Id, salary, companyName);
    }
   /* public void follow(){
        System.out.println(jobTitle + " " + name + "is following the project" ); } */
}
