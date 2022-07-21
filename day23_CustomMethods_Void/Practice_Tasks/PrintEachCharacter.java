package day23_CustomMethods_Void.Practice_Tasks;

public class PrintEachCharacter {
    public static void main(String[] args) {
   //create a method named printEachChar that can print each characters of a string

        print("Metin");
    }
    public static void print(String name){

        for (int i = 0; i < name.length(); i++) {

        char each = name.charAt(i); // cahr icindeki i butun karakterleri yazdirir.

        System.out.print(each);

        }
    }

}
