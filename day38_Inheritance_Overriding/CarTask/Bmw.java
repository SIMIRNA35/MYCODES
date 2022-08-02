package day38_Inheritance_Overriding.CarTask;

public class Bmw extends Car{
    public Bmw(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown() {
        System.out.println( brand +" " + model + " " + " breaks down efficiently.");

    }
    public void racing() {
        System.out.println("You can use your " + brand + model + "in racing mode in long");

    }

    @Override
    public void start() {
        System.out.println("Call mechanic to jump start " + brand + " " + model);
    }
}
