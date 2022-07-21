package day24_CustomMethods_Return.PracticeTasks;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        //5. create a method that can merge two arrays and return the new array
        //				arr1 = {1,2,3}
        //				arr2 = {4,5}
        //
        //				{1,2,3,4,5}

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};

        int[] combinedArray = mergingTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(combinedArray));

    }

    public static int[] mergingTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
            count++;
        }
            for (int j = 0; j < arr2.length; j++) {
                result[count++] = arr2[j];

            }
             return result;
        }


    }









