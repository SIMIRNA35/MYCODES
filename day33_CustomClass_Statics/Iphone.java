package day33_CustomClass_Statics;

public class Iphone {

    public static String brand = "Apple" ;  // it is the same value for all of the object

    public String model ; // birden fazla model oldugu icin instance variable yapiyoruz


    public double price;

    public static String OS = "IOS" ;

    public String color ;

    public String size ;

    public static String madeIn = "China" ;

    public static boolean hasBattery = true ;

    public static boolean isTouchScreen = true ;

    public static boolean hasFaceTime = true ;

    //public static void printModelAndPrice(){
     //   System.out.println(model + " : " + price ); // static method in java doesnt accept instances


    public  void method1(){
        System.out.println(model + " : " + price );
        System.out.println(OS);
    }







}
