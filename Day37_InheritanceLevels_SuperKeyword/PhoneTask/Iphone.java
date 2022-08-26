package Day37_InheritanceLevels_SuperKeyword.PhoneTask;

public class Iphone extends Phone{


    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

        //Iphone iphone13 = new Iphone("Iphone13","ProMax",854.45,"Red" );

    public void faceTime(){
        System.out.println( brand + " "+ model + " is having faceTime with email: " );
    }
    public void faceTime(String email) {
        System.out.println(brand + " " + model + " is having faceTime with email: " + email);

    }

    }




/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */