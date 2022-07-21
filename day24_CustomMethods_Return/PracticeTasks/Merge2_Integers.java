package day24_CustomMethods_Return.PracticeTasks;

import java.util.Arrays;

public class Merge2_Integers {
    public static void main(String[] args) {
  /*7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array
Ex:arr1 = {1,2,3}   arr2 = {4,5,6}      merge(arr1, arr2) ====> {1,2,3,4,5,6}   */

        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5, 6};

        int [] merge = merged(num1, num2);

        System.out.println(Arrays.toString(merge));
    }

    public static int[] merged (int[]num1, int[]num2){
        int[] result = new int[num1.length + num2.length];

        int count = 0;

        for (int i = 0; i < num1.length; i++) {
            result[i] = num1[i];
            count++;
        }
        for (int j = 0; j < num2.length; j++) {
            result[count++] = num2[j];



        }

        return result;
    }

    }

