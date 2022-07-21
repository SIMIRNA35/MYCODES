package Day30_CustomClassIntro.Practice_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MotoObjects {
    public static void main(String[] args) {

        Moto moto1 = new Moto();
        moto1.brand = "Suziki";
        moto1.model = "Fast and Furious";
        moto1.year = 2022;
        moto1.color = "Black";
        moto1.price = 70.546;

        Moto moto2 = new Moto();
        moto2.brand = "Yakazaki";
        moto2.model = "Crazy Speeders";
        moto2.year = 2021;
        moto2.color = "Red";
        moto2.price = 68.980;

        Moto moto3 = new Moto();

        moto3.setInfo("KTM", "Road flyer", 2020, "Red-Black", 62.546);

        System.out.println(moto1);
        System.out.println(moto2);
        System.out.println(moto3);

        System.out.println("--------------------------------------");

        moto1.drive();
        moto2.start();
        moto3.stop();

        System.out.println("-----------------------------------------------------");
        // Moto[] motos = { moto1, moto2, moto3 };

        ArrayList<Moto> motoList = new ArrayList<>();

        motoList.addAll(Arrays.asList(moto1, moto2, moto3));

        for (Moto each : motoList) {
            System.out.println(each.brand + ": " + each.price);

        }
        System.out.println("--------------------------------------------------------");


        /*
        Yakazaki : 2005 ~ 2008
        Suziki : 1995 ~ 1997
         */
    motoList.removeIf(p -> p.brand.equals("Yakazaki") && p.year >= 2005 && p.year <= 2008);
    motoList.removeIf(p -> p.brand.equals("Suziki") && p.year >= 1995 && p.year <=  1997 );


    }






    }

