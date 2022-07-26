package Day31_CustomClass_Constructors;

public class CarpettObcejects {

    public static void main(String[] args) {

    Carpett yeni1 = new Carpett(25,56,1250,
            false);

     // yeni1.setUnitPrice(1000);

     yeni1.setUnitPrice(yeni1.getUnitPrice() + 1000 );

        System.out.println(yeni1);


    }
}
