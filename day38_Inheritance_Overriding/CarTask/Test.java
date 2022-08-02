package day38_Inheritance_Overriding.CarTask;

public class Test {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota",2022,35.500,"Black",100);

        System.out.println(toyota);

        toyota.drive();
        toyota.start();
        toyota.reliable();

        System.out.println("-------------------------------------------------------------");


        Bmw bmw = new Bmw("X5",2021,29.850,"Red",150);

        System.out.println(bmw);

        bmw.start();
        bmw.drive();
        bmw.breaksDown();
        bmw.racing();

        System.out.println("-----------------------------------------------------------");

        Tesla tesla = new Tesla("3",2022,55.654,"White",300);

        System.out.println(tesla);

        tesla.drive();
        tesla.start();
        tesla.autoPilot();












    }





}
