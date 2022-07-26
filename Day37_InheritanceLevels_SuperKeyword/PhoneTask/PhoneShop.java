package Day37_InheritanceLevels_SuperKeyword.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone13", "ProMax", 854.45, "Red");

        Samsung samsung = new Samsung("Glaxy20", "6 inches", 500, "Gray");

        Nokia nokia = new Nokia("Brick", "4 inch", 50, "White");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    iphone.call(911);
    iphone.text(17986445);
    iphone.faceTime("met-oruc3@gmail.com");

        System.out.println("--------------------------");

    samsung.call(435249856);
    samsung.freeze();
    samsung.text(345656324);

        System.out.println("-----------------------");

     nokia.call(458713546);
     nokia.text(789456134);
     nokia.selfDefense();

        System.out.println(Iphone.hasBattery);
    }





}
