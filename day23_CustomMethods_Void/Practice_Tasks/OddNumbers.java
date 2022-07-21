package day23_CustomMethods_Void.Practice_Tasks;

public class OddNumbers {
    public static void main(String[] args) {
        //  1. create a method that can print odd numbers between 1~100 in a same line saperated by space

        PrintOddnumbers(2, 101);


    }

    public static void PrintOddnumbers(int x, int y) {
        for (int i = x; i < y; i += 2) {

            System.out.print(i + " ");

        }
    }

}
























