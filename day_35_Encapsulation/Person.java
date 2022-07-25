package day_35_Encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0) {
            System.out.println("Invalid Age:" + age);
        }


        this.age = age;


    }
}
