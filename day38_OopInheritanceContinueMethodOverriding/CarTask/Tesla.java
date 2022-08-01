package day38_OopInheritanceContinueMethodOverriding.CarTask;

public class Tesla extends Car{
    public Tesla(String brand, String model, int year, double price, String color, int miles) {
        super("TESLA", model, year, price, color, miles);

    }

    public void autoPilot() {
        System.out.println( brand + " has auto-pilot system" );

    }

}
