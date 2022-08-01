package day38_OopInheritanceContinueMethodOverriding.CarTask;

public class Toyota extends Car{


         public Toyota(String brand, String model, int year, double price, String color, int miles) {
             super("Toyota", model, year, price, color, miles);
         }
            public void reliabile(){
                System.out.println( "The most reliable car's " + brand );
            }


        }



