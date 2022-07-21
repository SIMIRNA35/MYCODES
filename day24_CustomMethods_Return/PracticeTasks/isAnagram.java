package day24_CustomMethods_Return.PracticeTasks;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
  /*2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
  	Ex:  str1 = "cba"         str2 = "bac";    isAnagram(str1, str2) ====> true
         */


        ////checks if the given string is anagram, returns boolean

        String str1 = "cba";
        String str2 = "bac";

        boolean result = isAnagram(str1, str2);
        System.out.println(str1 + " and " + str2 + " is anagram = " + result);

    }


    public static boolean isAnagram (String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);



        return Arrays.equals(ch1,ch2);
    }
}
