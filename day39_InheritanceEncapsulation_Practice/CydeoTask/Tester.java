package day39_InheritanceEncapsulation_Practice.CydeoTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    public void createTicket(){
        System.out.println( getJobTitle() + " is creating test tickets" );
    }

    @Override
    public void work() {
        System.out.println( getJobTitle() + " " + getName() +  " is working" );
    }
}





/*
3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */