package Day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {
    public static void main(String[] args) {

       Offer offer1 = new Offer();
       offer1.setInfo("Toulouse","CapGemini", "Full Stack Automation", 110.00
               ,true,true ,true , true);

       Offer offer2 = new Offer();
       offer2.setInfo("Marseille","Cydeo", "SDET",
                95.456,true,false ,true , false);

        Offer offer3 = new Offer();
        offer3.setInfo("Aix","Lone Deer", "Java Developer",
                135.000,true,true ,false , true);
        Offer offer4 = new Offer();
        offer4.setInfo("Marseille","My code", "SDET",
                187.000,false,false ,true , false);

        Offer offer5 = new Offer();
        offer5.setInfo("Lyon","Maxy", "Full Stack Automation",
                70.852,true,true ,false , true);

        Offer offer6 = new Offer();
        offer6.setInfo("Paris","CyberTech", "SDET",
                85.000,true,false ,true , false);

        Offer offer7 = new Offer();
        offer7.setInfo("Marseille","Pack Solution", "Java Developer",
                52.210,true,false ,false , true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        System.out.println(offer6);
        System.out.println(offer7);

        System.out.println("----------------------------------------------------");



       Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

       ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime) ; // removes if the offer in NOT fulltime*

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers)) ;
        localOffers.removeIf(p -> !p.location.equals("Marseille"));

        System.out.println(localOffers.size());

        System.out.println("----------------------------------");

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers)) ;
        offersWithBenefits.removeIf(p -> !p.hasBenefit && !p.hasPTO);

        System.out.println(offersWithBenefits.size());

          System.out.println("---------------------------------------------------");

       ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers)) ;
       sdetOffers.removeIf(p -> !p.jobtitle.equals("SDET")) ;

        System.out.println(sdetOffers.size());

        System.out.println("------------------------------------");


        for (Offer localOffer : localOffers) {

             System.out.println(localOffer.companyName  + " : "+ localOffer.salaries);}

        System.out.println("-------------------------------");


        }


        }



