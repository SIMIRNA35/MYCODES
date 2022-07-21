package day23_CustomMethods_Void.Practice_Tasks;

public class InitalsOfPerson {
    public static void main(String[] args) {


        Initials("metin" , "oruc");
    }
    public static void Initials(String f, String l){

       String initial = f.charAt(0) + "." + l.charAt(0);

        initial = initial.toUpperCase();

        System.out.println("initial = " + initial);

        System.out.println(initial);





    }

}
