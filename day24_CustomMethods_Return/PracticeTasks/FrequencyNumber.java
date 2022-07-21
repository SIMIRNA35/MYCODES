package day24_CustomMethods_Return.PracticeTasks;

public class FrequencyNumber {
    public static void main(String[] args) {
 /*5. create method that accepts one integer array and one integer number and returns the frequency of the number
Ex:int[] array ={1,1,1,1,1,2,2};   frequency(array, 1) ==> 5   */

        int[] array = {1, 1, 1, 1, 2, 2};
        int freq = frequencyOfNumber(array, 1);

        System.out.println(freq);

    }

    public static int frequencyOfNumber(int[] array , int number) {
        int count = 0;
        for (int each : array) {
            if (each == number) {
                count++;
            }
        } return count;
    }
}






