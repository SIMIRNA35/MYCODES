package Day37_InheritanceLevels_SuperKeyword.PhoneTask;

public class Phone {

    public String brand ;
    public String model ;
    public String size ;
    public double price;
    public String color ;

    public static boolean hasBattery ;


    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
        hasBattery = true ;
    }


    public void call(long phoneNulber){
        System.out.println(brand + " "+ model + " is calling " + phoneNulber);
    }
    public void text(long phoneNulber){
        System.out.println(brand + " "+ model + " is texting " + phoneNulber); }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price = $" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }
}









/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */