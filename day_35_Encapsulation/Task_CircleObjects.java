package day_35_Encapsulation;

public class Task_CircleObjects {

    public static void main(String[] args) {

        Task_Circle c1 = new Task_Circle( 5.0);

         c1.getRadius();

         c1.setRadius(c1.getRadius() + 20.2);
        System.out.println(c1.getRadius());

        System.out.println(c1.getRadius());




        System.out.println("c1 = " + c1);
    }
}