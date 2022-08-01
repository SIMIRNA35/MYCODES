package day38_OopInheritanceContinueMethodOverriding.CarTask;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota","Avensis",2022,35.550,"Black",100);

        System.out.println(car1);

        car1.drive();
        car1.start();



        Car car2 = new Car("BMW","X5",2021,29.850,"Red",150);

        System.out.println(car2);

        car2.start();
        car2.drive();

        Car car3 = new Car("Tesla","3",2022,55.654,"White",300);

        System.out.println(car3);

        car3.drive();
        car3.start();












    }





}
