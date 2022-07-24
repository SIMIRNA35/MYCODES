package day02_HelloWorld;

import java.util.Arrays;

public class HelloCydeo {

    public static void main(String[] args) {

        System.out.println("Hello Cydeo");
        System.out.println("Wooden Spoon");


        String str = "Hello world";
        str.trim();
        int z= str.indexOf("");
        System.out.println(z);

        String str1 = "Batch 21";

        int Z = str1.trim().length();

        System.out.println(Z);

        int a = 0 ;
        while (a <= 6 ) {
            a+=2;


        }

        System.out.println(a);


        int n = 5 ;

        while (n < 100) {
            n += n ;
        }

        System.out.println(n);

        String o = "today I will go to the beach" ;
        boolean p = o.contains("i");
        boolean h = o.substring(12).startsWith("go");

        String r = p & h ? "go" : "dont go" ;
        System.out.println(r);

        String [] words = {"one","two","three","four","five"};
        String [] other = new String[words.length];
        int index = 0;
        for (String word : words) {
            other[index++] = word + word.length();

        }
        System.out.println(Arrays.toString(other));


    }

}

