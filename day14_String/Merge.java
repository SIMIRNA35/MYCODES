package day14_String;

import java.util.Scanner;

public class Merge {
    public class Practice {

        public static String mergeTheString(String str1, String str2){// method signature should match with variables inside the method body

            String merge ="";
            //123           abcef
            if (str1.length() < str2.length()) {
                for (int i = 0; i <= str1.length()-1; i++) {
                    merge += ""+str1.charAt(i) + str2.charAt(i);
                    //System.out.println(merge);
                }
                merge += str2.substring(str1.length());
            } else {
                for (int i = 0; i <= str2.length()-1; i++) {
                    merge += ""+str1.charAt(i) + str2.charAt(i);
                }
                merge += str1.substring(str2.length());
            }
            return merge;
        }
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first string");
            String str3 = scan.nextLine();
            System.out.println("Enter second string");
            String str4 = scan.nextLine();

            System.out.println("Str1 = " + str3 + " Str2 = " + str4  + " Merged = " + mergeTheString(str3,str4));
        }
    }

        /*
        Write code to merge given 2 Strings, one letter at a time, starting with one. Please note one and two can be of different lengths.

        Examples:
        s1 ==> "12345"
        s2 ==> "abcde"
        Result: "1a2b3c4d5e"

        Solution Phases:
        1- First, create 2 String variables and then your code should merge them one letter at a time
        2- Secondly, use Scanner class and ask user to enter 2 Strings and then use them in your code to get the result
        3- Create a void method and put all of your code inside it
        4- Change your method's return type (void) into String and return the new String
        5- Fix the code for the example: 12345 and abc = 1a2b3c45
         */

}


