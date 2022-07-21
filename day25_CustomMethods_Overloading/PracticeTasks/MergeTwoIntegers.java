package day25_CustomMethods_Overloading.PracticeTasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoIntegers {
    public static void main(String[] args) {
/*Task1:
	1. create a method that can merge two integer arrays.  2. create a method that can merge two double arrays.
	3. create a method that can merge two char arrays.  4. create a method that can merge two String arrays. */

        int [] number = {2};
        int [] number2 = {3};
        mergeTwoArrays(number,number2);

        /*
         int[] result = {};

        for (int each : number) {
            result = ArraysUtility.addElement(result, each);
        }

        for (int each : number2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
         */

        double [] num = {15.0};
        double [] num1 = {225.0};
        mergeTwoArrays(num,num1);

        char[] chars ={'M'};
        char[] chars1 ={'A'};
        mergeTwoArrays(chars,chars1);

        String [] str = {"Metin"};
        String [] str1 = {"Akile"};
        mergeTwoArrays(str,str1);

        System.out.println(Arrays.toString(mergeTwoArrays(number,number2)));
        System.out.println(Arrays.toString(mergeTwoArrays(num,num1)));
        System.out.println(Arrays.toString(mergeTwoArrays(chars,chars1)));
        System.out.println(Arrays.toString(mergeTwoArrays(str,str1)));
    }
    public static int [] mergeTwoArrays (int[] number, int[] number2){

       return ArraysUtility.merge(number,number2);
       
    }
    public static double [] mergeTwoArrays (double[] number, double[] number2) {

        return ArraysUtility.merge(number,number2);
    }
    public static char [] mergeTwoArrays (char[] number, char[] number2) {

        return ArraysUtility.merge(number,number2);
    }
    public static String [] mergeTwoArrays (String[] number, String[] number2) {

        return ArraysUtility.merge(number, number2);
    }
}
