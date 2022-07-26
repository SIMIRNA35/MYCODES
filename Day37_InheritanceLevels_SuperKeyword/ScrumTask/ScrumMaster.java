package Day37_InheritanceLevels_SuperKeyword.ScrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender,int Id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", Id, salary, companyName);
    }
     /* public void manage(){
        System.out.println(jobTitle + " " + name + "is managing the project" ); } */

}
