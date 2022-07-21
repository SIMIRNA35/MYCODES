package day25_CustomMethods_Overloading.PracticeTasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
 /*Task 4:
	1. Create a method that can reverse an integer array
	2. Create a method that can reverse a double array
	3. Create a method that can reverse a char array
	4. Create a method that can reverse a String array */
        
        int [] arrr = {1,2,3,4,5};
        int [] reversed = reverse(arrr);
        System.out.println(Arrays.toString(reversed));


        double [] arr1 = {1.25,2.4,3.56,4.98,5.00};
        double [] reversed1 = reverse(arr1);
        System.out.println(Arrays.toString(reversed1));

        char [] ch = {'A','B','C','D','E'};
        char [] reversed2 = reverse(ch);
        System.out.println(Arrays.toString(reversed2));

        String[] str1 = {"Metin"};
        String[] str2 = reverse(str1);
        System.out.println(Arrays.toString(str2));
    }
    public static int [] reverse (int [] arrr){
        return ArraysUtility.reverse(arrr);
    }
    public static double [] reverse (double [] arrr) {
        return ArraysUtility.reverse(arrr);
    }
    public static char [] reverse (char [] arrr) {
        return ArraysUtility.reverse(arrr);
    }
    public static String [] reverse (String [] arrr) {
        return ArraysUtility.reverse(arrr);

        /*String[] result = new String[arrr.length];
        int j = 0;
        for (int i = arrr.length - 1; i >= 0; i--) {
            result[j++] = arrr[i];
        }

        return result;*/
    }
}
