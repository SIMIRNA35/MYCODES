package day24_CustomMethods_Return.PracticeTasks;



import java.util.Scanner;

public class ReverseLetters_Replits {
    public static void main(String[] args) {
 /*Create a method reverseNoSpec(String) that will reverse a string without affecting special characters
Given a string,that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.
        Input:   str = "a,b$c"
         Output:  str = "c,b$a"
        Note that $ and , are not moved anywhere.
        Only subsequence "abc" is reversed.  */

        String str = "a,b$c";

        String reversed = reverseNoSpec(str);

        System.out.println(reversed);



    }

    public static String reverseNoSpec(String str) {

        String result = "";


       for (int i = str.length()-1; i >= 0 ; i--) {

            result += str.charAt(i);


        }
        return result;
    }

}



