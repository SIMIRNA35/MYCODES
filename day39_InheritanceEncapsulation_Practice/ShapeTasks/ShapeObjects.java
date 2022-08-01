package day39_InheritanceEncapsulation_Practice.ShapeTasks;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(10);

               System.out.println(square);

        System.out.println("-------------------------------");

        Circle circle = new Circle(4.0);


        System.out.println(circle);

        circle.setRadius(15.5);
        System.out.println(circle.getRadius());

        System.out.println(circle);




        System.out.println("-------------------------------------");

        Rectangle rectangle = new Rectangle(2.0,5.0);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle);

        System.out.println(rectangle.getName());


    }








}
