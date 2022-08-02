package day38_Inheritance_Overriding.CarTask;

public class Tesla extends Car{
    public Tesla(String model , int year, double price, String color, int miles) {
        super("TESLA", model, year, price, color, miles);

    }

    @Override
    public void start() {
        System.out.println("Say  \"start\" to start " + brand+ " " + model);
    }

    public void autoPilot() {
        System.out.println( brand + " has auto-pilot system" );

    }

}
