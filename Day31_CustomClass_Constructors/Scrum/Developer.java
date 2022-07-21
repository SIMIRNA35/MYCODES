package Day31_CustomClass_Constructors.Scrum;

public class Developer {

    public String name;
    public int employeeID;
    public String JobTitle;
    public double Salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        JobTitle = jobTitle;
        Salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", JobTitle='" + JobTitle + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void creatingTicket() {
        System.out.println(name + " unit testing");
    }

    public void dailyStandUp() {
        System.out.println(name + " is fixing bug");


    }
}
