package day34_GarbageCollection_AccessModifiers;

import java.util.Locale;

public class sinav {

    public static void main(String[] args) {

        String word = "   Winter is coming   ";
        word  = word.trim();
        System.out.println(word.length()); // 16

        System.out.println("----------------------------");

        String a = "123";
        String b = 5+4+a ;
        System.out.println(b); // 9123

        System.out.println("----------------------");

        String result = 3425 > (9*1000) ? "garden" : "patio" ;
        String s= result.substring(2);
        System.out.println(s); // tio

        System.out.println("-----------------------");

        String m = "the game was tied at 2-2";
        String l = m.substring(5);

        int index1 = m.indexOf("game");
        int index2 = l.indexOf("game");

        if (index1==index2){
            System.out.println(index1);

        }else {
            System.out.println(index2);
        }

        System.out.println("----------------------------");

        String z = "popcorn" ;
        z= z.substring(1,8);

        if (z.equals("opcron")){
            System.out.println(z.length());

        }else {
            System.out.println(z.replace("o,","a"));
        }
        if (z.equals("opcron")){
            System.out.println(z.length());

        }else {
            System.out.println(z.replace("o,","a"));
        }






    }
}
