package day26_Custom_Methods_Practice.PracticeTaskq;

import utilities.ArraysUtility;

public class FrequencyElement {
    public static void main(String[] args) {
/*1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns the frequency of the given integer element from the integer array
  1.2 Create a method that passes two parameters: a double array and a double element. The method returns the frequency of the given integer from the array
  1.3 Create a method that passes two parameters: a char array and a char element. The method returns the frequency of the given char element from the char array
1.4 Create a method that passes two parameters: a String array and a String element. The method returns the frequency of the given String element from the String array


 */
        int[] arr = {5, 5, 5, 6, 8, 7, 7, 9, 6, 5, 5, 6};
        int n = frequencyOfElement(arr, 5);
        System.out.println(n);
        System.out.println("------------------------------------");

        double[] a = {5.0, 5.0 , 5.0, 6.0, 8.0, 7.0, 7.0, 9.0, 6.0, 5.0, 5.0, 6.0};
        double m = frequencyOfElement(a,7.0);
        System.out.println(m);
        System.out.println("----------------------------------------");

        char[] chr = {'A','A','A','A','A','B','B','B','C','D','E','F'};
        char ch1 = (char) frequencyOfElement(arr,'B');

        System.out.println(ch1);
        System.out.println("-----------------------------------------------");

        String[] str = {"Metin","java","java","Metin","Metin"};
        String str1 = String.valueOf(frequencyOfElement(str,"Metin"));
        System.out.println(str1);




    }

    public static int frequencyOfElement(int[] arr, int element) {

        return ArraysUtility.frequencyOfElement(arr, element);
       /* int count = 0;

        for (int each : arr) {
            if (each == element) {
                count++;

            }
        }
        return count;*/
    }

    public static double frequencyOfElement(double [] arr, double element) {
        return ArraysUtility.frequencyOfElement(arr, element);
    }

    public static int frequencyOfElement(char[] arr, char element) {
   return ArraysUtility.frequencyOfElement(arr,element);
    }
    public static int frequencyOfElement(String[] arr, String element) {
        int count = 0;
        for (String each : arr) {
            if(each.equals(element)){
                count++;
            }

        }

        return count;
    }
    }



