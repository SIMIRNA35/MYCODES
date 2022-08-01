package day39_InheritanceEncapsulation_Practice.CydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester  = new Tester("Metin", 37, 'M', 356, "SDET", 48.200);

        Developer developer = new Developer("Ali",25,'f',897,"Java Developer",89000);

        Teacher teacher = new Teacher("Akile",35,'F',546,"TEACHER",65.420);

        Student student = new Student("Elif",32,'M',235,"SDET");

        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);
        System.out.println(developer);

        tester.createTicket();
        tester.work();
        tester.eat();
        tester.drink();

        System.out.println("-----------------------");

        developer.fixingBugs();
        developer.work();
        developer.drink();

        System.out.println("-------------------------");

        teacher.work();
        teacher.drink();

        System.out.println("-------------------");

        student.study();
        student.eat();










    }








    //Developer,Teacher, Student
}
/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes

 */