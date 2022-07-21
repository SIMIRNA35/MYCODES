package day24_CustomMethods_Return.PracticeTasks;

public class sumOf2Numbers {
    public static void main(String[] args) {
        /*1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers
	  2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers */

        int num1 = 56 ;
        int num2 = 89 ;

        int sum = sumof2numbers(num1,num2);

        System.out.println("sum = " + sum);

        int sum2 = sumof3numbers(56,89,10);
        System.out.println("sum2 = " + sum2);

        int sum3 = sumof4numbers(56,89,10,20);
        System.out.println("sum3 = " + sum3);

   }
   public static int sumof2numbers (int num1, int num2){

    return num1+num2;
       }
       public static int sumof3numbers(int num1,int num2, int num3){
        return num1+num2+num3;
       }

    public static int sumof4numbers(int num1,int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}

