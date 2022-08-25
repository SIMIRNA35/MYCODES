package Day43_Abstraction.Car;

public class CarShop {
    public static void main(String[] args) {

     //   Car car1 = new Car("Cydeo", "25", "Blue" , 2022, 100000) ;
        // we can not create object from abstract class because abstract class is not concrete class

     Honda honda = new Honda("Accord", "Black",2019,30000);

     Audi audi = new Audi("Q7","White", 2021,60000);

     Tesla tesla = new Tesla("Model3","White", 2021,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setPrice(25000);
        audi.setPrice(56000);
        tesla.setPrice(10000);

        honda.setColor("Red");
        audi.setColor("Yellow");
        tesla.setColor("blue");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);



















            }
        }
