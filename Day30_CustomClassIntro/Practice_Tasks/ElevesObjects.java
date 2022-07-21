package Day30_CustomClassIntro.Practice_Tasks;

import java.util.ArrayList;

public class ElevesObjects {
    public static void main(String[] args) {

        Eleve eleve1 = new Eleve();
        eleve1.setInfo("Elif",'F',10 , 222 , 'A');

        Eleve eleve2 = new Eleve();
        eleve2.setInfo("Erva",'F',5,102,'B');

        Eleve eleve3 = new  Eleve();
        eleve3.setInfo("Muaz" , 'M',9,546,'C');

        Eleve eleve4 = new  Eleve();
        eleve4.setInfo("Ayse",'F','4',789,'B');

        Eleve eleve5 = new  Eleve();
        eleve5.setInfo("Costance",'F',8,412,'A');

        Eleve [] eleves = {eleve1,eleve2,eleve3,eleve4,eleve5};

        for ( Eleve eleve : eleves) {
            System.out.println(eleve);

        }
        System.out.println("-----------------------------------");

        ArrayList<Eleve> earlyBirds = new ArrayList<>() ; // grade A
        ArrayList<Eleve> angryBirds = new ArrayList<>() ;

        for (Eleve eleve: eleves) {
            if (eleve.grade == 'A'){
                earlyBirds.add(eleve);

        }else {
               angryBirds.add(eleve);

            }

            System.out.println(earlyBirds);

            System.out.println(angryBirds);
        }
            
        }



    }
