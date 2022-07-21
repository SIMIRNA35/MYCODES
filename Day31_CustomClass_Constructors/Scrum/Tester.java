package Day31_CustomClass_Constructors.Scrum;

public class Tester {
    public String name;
    public int employeeID;
    public String JobTitle;
    public double Salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        Salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public void smokeTesting() {
        System.out.println(name + "is smoke tasting");
    }

    public void creatingTicket() {
        System.out.println(name + "is creating ticket()");
    }
    public void dailyStandUp() {
        System.out.println(name + "is doing daily standUp" ) ;

    }
}

