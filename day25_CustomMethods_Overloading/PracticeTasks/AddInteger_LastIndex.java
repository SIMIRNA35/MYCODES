package day25_CustomMethods_Overloading.PracticeTasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddInteger_LastIndex {
    public static void main(String[] args) {
/*Task2:1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
{1,2,3,4}, 5  new array ==> {1,2,3,4,5}
 2. create a return method called addDouble that can add a double after the last index of a double array
 3. create a return method called addString that can add a String after the last index of a String array
 4. create a return method called addChar that can add a char after last index of a char array */ 
        
        int[] arr = {1,2,3,4};
        int element = 5;
        AddElement(arr,element);
        System.out.println(Arrays.toString(AddElement(arr,element)));

        double[] a = {1.5,3.6,75.56,99.65} ;
        double e = 10.5;
        AddElement(a,e);
        System.out.println(Arrays.toString(AddElement(a,e)));
        
        String [] cool = {"Metin,and"};
        String love ="Akile";
        AddElement(cool,love);
        System.out.println(Arrays.toString(AddElement(cool,love)));

        char [] ch = {'l','O','V'};
        char ch1 = 'E';
        AddElement(ch,ch1);
        System.out.println(Arrays.toString(AddElement(ch,ch1)));


    }
    public static int[] AddElement(int[] arr, int element){return ArraysUtility.addElement(arr,element);
    }
    public static double[] AddElement(double[] arr, double element) {return ArraysUtility.addElement(arr, element);
    }
    public static String[] AddElement(String[] arr, String element) {return ArraysUtility.addElement(arr, element);
    }
    public static char[] AddElement(char[] arr, char element) {return ArraysUtility.addElement(arr, element);

     /*    char[] result = new char[ch.length + 1];

        int i =0;
        for (char each : ch) {
            result[i++] = each;
        }

        result[result.length-1] = ch1; // element need to be assigned to the last index
        // result[i] = element;

        return result;


     */







    }
}
