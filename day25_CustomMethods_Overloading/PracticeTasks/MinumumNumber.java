package day25_CustomMethods_Overloading.PracticeTasks;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinumumNumber {
    public static void main(String[] args) {
/* Task 3:
	1. create a method that can return the min number from an integer array
	2. create a method that can return the min number from double array
	3. create a method that can return the min number from long array
	4. create a method that can return the min number from short array
	5. create a method that can return the min number from float array
	6. create a method that can return the min number from byte array
        
 */
        int[] numbers = {25, 65, 987, 54, 26};
        int minimumNumber = minNumbers(numbers);
        System.out.println("minimumNumber = " + minimumNumber);

        double[] num = {10.5, 21.45, 100.65, 3.78, 456.456};
        minNumbers(num);
        System.out.println(minNumbers(num));

        long [] num1 = {1235, 98656, 9123456, 685894756, 125654};
        minNumbers(num1);
        System.out.println(minNumbers(num1));

        float[] num2 = {25f, 65f, 987f, 54f, 26f};
        minNumbers(num2);
        System.out.println(minNumbers(num2));

        byte[] num3 = {25, 65, 45, 54, 26};
        minNumbers(num3);
        System.out.println(minNumbers(num3));

    }

    public static int minNumbers(int[] numbers) {
        return ArraysUtility.min(numbers);
         /* Arrays.sort(numbers);
        return numbers[numbers.length-1];*/
    }

    public static double minNumbers(double[] numbers) {
        return ArraysUtility.min(numbers);
    }

    public static long minNumbers(long[] numbers) {
        return ArraysUtility.min(numbers);
    }

    public static short minNumbers(short[] numbers) {
            return ArraysUtility.min(numbers);

    }
    public static float minNumbers(float[] numbers){
        return ArraysUtility.min(numbers);


    }
    public  static byte minNumbers(byte[] numbers) {
        return ArraysUtility.min(numbers);

    }
}
   
        
        
        
        
        
        
        

