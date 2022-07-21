package day23_CustomMethods_Void.Practice_Tasks;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
    /*4. create a method that can check if a person is eligible to vote
	Ex:	eligibleToVote(19, "USA"); 	output: You are not eligible to vote!   */

        EligibleToVote(19, "USA" );
    }



    public static void EligibleToVote( int age, String nationality){

       if (age >= 19 && nationality.equalsIgnoreCase("usa")){

            System.out.println("You are  eligible to vote! \n");

        }else {
            System.out.println("You are not eligible to vote! \n");
        }

    }

        }














