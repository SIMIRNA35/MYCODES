package day23_CustomMethods_Void.Practice_Tasks;

public class PositiveNegative {
    public static void main(String[] args) {
        //create a method that can if the given integer is positive, negative or zero

        number(0);
    }
    public static void number(int num){

        if (num < 0){
            System.out.println(num + " is Negative Number");
        }else if (num > 0 ) {
            System.out.println( num + " Is Positive Number");
        }else if (num == 0){
            System.out.println( num + " Is Zero Number");
        }




    }
}
