package day24_CustomMethods_Return.PracticeTasks;

import java.util.Scanner;

public class ReverseWord_2 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a string to reverse it:");
            String str = scan.nextLine();

            System.out.println(reverse(str));

            scan.close();

        }

        public static String reverse(String str){

            String reversedStr = "";

            for(int i = str.length()-1; i >= 0; i--){

                reversedStr += str.charAt(i); //a, v, a, J

            }
            return reversedStr;
        }
    }

