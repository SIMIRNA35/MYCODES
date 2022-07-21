package day32_ConstructorOverloading_Calls;

public class Carobjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda" , "Accord");

        Car car3 = new Car("Lexus" , "RX350" , 2021);

        Car car4 = new Car("Mazda" , "6" , 2020 , 10000);

        Car car5 = new Car("BMW" , "X6" , 2022 , 125000, "Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }


}


