package day35_Encapsulation;

public class employeeObjets {
    public static void main(String[] args) {

        employee e1 = new employee("Metin" ,'M', 37 , 35000);

        e1.setAge(28); // we can change the data

         System.out.println(e1);

         employee e2 = new employee("Akile",'F',35,42000);

         e2.setSalary(e2.getSalary() + 15000); // we increased the salary
        System.out.println(e2);




    }
}
