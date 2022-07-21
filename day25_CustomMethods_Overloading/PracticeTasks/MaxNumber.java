package day25_CustomMethods_Overloading.PracticeTasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
 /*Task 2:
	1. create a method that can return the max number from an integer array
	2. create a method that can return the max number from double array
	3. create a method that can return the max number from long array
	4. create a method that can return the max number from short array
	5. create a method that can return the max number from float array
	6. create a method that can return the max number from float array     */

        int[] numbers = {25, 65, 987, 54, 26};
        int maximumNumber = maxNumbers(numbers);
        System.out.println("maximumNumber = " + maximumNumber);
        
        double[] num = {10.5, 21.45, 100.65, 3.78, 456.456};
        maxNumbers(num);
        System.out.println(maxNumbers(num));

        long [] num1 = {1235, 98656, 9123456, 685894756, 125654};
        maxNumbers(num1);
        System.out.println(maxNumbers(num1));

        float[] num2 = {25f, 65f, 987f, 54f, 26f};
        maxNumbers(num2);
        System.out.println(maxNumbers(num2));

        byte[] num3 = {25, 65, 45, 54, 26};
        maxNumbers(num3);
        System.out.println(maxNumbers(num3));

    }

    public static int maxNumbers(int[] numbers) {
        return ArraysUtility.max(numbers);
         /* Arrays.sort(numbers);
        return numbers[numbers.length-1];*/
    }

    public static double maxNumbers(double[] numbers) {
        return ArraysUtility.max(numbers);
    }

    public static long maxNumbers(long[] numbers) {
        return ArraysUtility.max(numbers);
    }

    public static short maxNumbers(short[] numbers) {
        return ArraysUtility.max(numbers);

    }
    public static float maxNumbers(float[] numbers){
        return ArraysUtility.max(numbers);


    }
    public  static byte maxNumbers(byte[] numbers) {
        return ArraysUtility.max(numbers);

    }
    }


