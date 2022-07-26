package Day37_InheritanceLevels_SuperKeyword.ScrumTask;

public class Tester extends Employee { // Tester is a employee


    public Tester(String name, int age, char gender, String jobTitle, int Id, double salary, String companyName) {
        super(name, age, gender, jobTitle, Id, salary, companyName);
    }
    public void createTicket() {
        System.out.println(jobTitle + " " + name + "is creating ticket" );
    }
}

/*
Add any extra variable or method that Tester object need to have
 */