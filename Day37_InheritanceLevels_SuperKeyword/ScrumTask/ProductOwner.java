package Day37_InheritanceLevels_SuperKeyword.ScrumTask;

public class ProductOwner extends Employee {
    public ProductOwner(String name, int age, char gender,int Id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", Id, salary, companyName);
    }
   /* public void manage(){
        System.out.println(jobTitle + " " + name + "is managing the project" ); } */
}
