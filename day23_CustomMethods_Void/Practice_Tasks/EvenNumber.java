package day23_CustomMethods_Void.Practice_Tasks;

public class EvenNumber {
    public static void main(String[] args) {
        //2. create a method that can print even numbers between 1~100 in a same line saperated by

        PrintEvenNumbers(1, 100);


    }

    public static void PrintEvenNumbers(int a, int b) {
        for (int j = a; j < b; j += 2) {

            System.out.print(j + " ");
        }
    }
}