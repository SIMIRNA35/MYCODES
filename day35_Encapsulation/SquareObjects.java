package day35_Encapsulation;

public class SquareObjects {
    public static void main(String[] args) {

        Square s1 = new Square(8.0);

        System.out.println(s1);

        s1.setSide(s1.getSide()+ 20 );

        System.out.println(s1.getSide());
        System.out.println(s1);



    }




}
