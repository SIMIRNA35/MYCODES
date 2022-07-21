package day24_CustomMethods_Return.PracticeTasks;

import java.util.Arrays;

public class MaximumNumberArray {
    public static void main(String[] args) {
// 2. create a method that can return the maximum number from an array of integers

        int[] givennumber =  {10, 50, 21, 89, 99};

        int maximumNumber =  maximumNumberArray(givennumber);

        System.out.println("maximumNumber = " + maximumNumber);



    }

    public static int maximumNumberArray(int[] number) {

        int max = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] > max) {

                max = number[i];
            }
        }

        return max;
    }
}

