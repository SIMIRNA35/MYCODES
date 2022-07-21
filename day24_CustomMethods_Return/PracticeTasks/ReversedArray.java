package day24_CustomMethods_Return.PracticeTasks;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        // 4. create a method that return the reversed array
        //		{1,2,3,4,5} === > {5,4,3,2,1}
        int[] num = {1, 2, 3, 4, 5};

        int[] reverseArray = reversedArray(num);
        System.out.println(Arrays.toString(reverseArray));

    }
     public static int [] reversedArray(int []arr)   {
            int[] newArr = new int[arr.length];
            for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                newArr[j] = arr[i];
            }
            return newArr;
        }
    }



