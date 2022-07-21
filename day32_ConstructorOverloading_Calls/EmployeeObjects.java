package day32_ConstructorOverloading_Calls;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aeoron") ;

        Employee employee2 = new Employee("Metin", 'M');

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
