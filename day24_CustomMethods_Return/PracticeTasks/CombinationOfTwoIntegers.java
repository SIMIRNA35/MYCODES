package day24_CustomMethods_Return.PracticeTasks;


import java.util.Arrays;

public class CombinationOfTwoIntegers {
    public static void main(String[] args) {
 /* Task 2 :   Create a method that can print out the combination of two integer arrays
   int[] array1 = {1,2,3,4};        int[] array2 = {5, 6, 7, 8, 9, 10};
                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  */
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9, 10};

        int[] combinated = combination(array1, array2);

        System.out.println(Arrays.toString(combinated));


    }

    public static int[] combination(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
            count++;
        }

            for (int j = 0; j < array2.length; j++) {
                result[count++] = array2[j];
            }
        return result;
        }

    }


        
        






