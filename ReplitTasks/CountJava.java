package ReplitTasks;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        /*
        Print the number of times that the string "java" appears anywhere in the given string word

Example:input: javaxjava
output: 2Example:input: javaxjavaapplepearjavaegg
output: 3
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

     int count = 0 ;

        for (int i = 0; i <= word.length()-4; i++) {

            String s = word.substring(i,i+4);

            if (s.equalsIgnoreCase("java")){

                count++ ;
            }


        }

        System.out.println(count);
    }
}
