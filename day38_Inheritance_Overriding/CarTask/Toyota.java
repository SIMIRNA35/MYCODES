package day38_Inheritance_Overriding.CarTask;

public class Toyota extends Car {


    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }
        public void reliable() {
            System.out.println("The most reliable car's " + brand + model);
        }

        public void start(){
            System.out.println("Twist the key to ignition to start" + brand+ " " + model);
        }


    }




