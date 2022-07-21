package day23_CustomMethods_Void.Practice_Tasks;

public class CalculateGrade {
    public static void main(String[] args) {

       // Create a method that can calculate the grade of the student based on the score

         grades(80);

       bilan(65) ;

    }

     public static void grades(int score ) {
       if (score >= 90 && score <=100 ){
           System.out.println( "Excellent");

       } else if (score >= 80 && score <=89 ) {
           System.out.println("Great Job");


       }else if (score >= 70 && score <= 79 ) {
           System.out.println("Good");


       }else if (score >= 60 && score <= 69 ){
           System.out.println("Passed");

       }else if (score >= 0 && score <= 59){
           System.out.println("Failed");
       }


     }

         public static void bilan(int note){

             if(note >=0 && note<= 100){

              String bilan = (note >= 90)?"A" :(note >= 80)?"B" :(note >= 70)?"C" :(note >= 60)?"D" : "E";
             }

             System.out.println("note = " + note);




         }






}
