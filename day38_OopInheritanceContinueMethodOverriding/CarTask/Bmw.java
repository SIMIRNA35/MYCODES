package day38_OopInheritanceContinueMethodOverriding.CarTask;

public class Bmw extends Car{
    public Bmw(String brand, String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void  breaksDown() {
        System.out.println( brand + model + "breaks down efficiently."  );

    }
    public void racing() {
        System.out.println("You can use your " + brand + model + "in racing mode in long");

    }


}
