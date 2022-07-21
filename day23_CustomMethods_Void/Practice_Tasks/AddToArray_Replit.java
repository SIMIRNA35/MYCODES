package day23_CustomMethods_Void.Practice_Tasks;
import java.util.Arrays;
import java.util.Scanner;

public class AddToArray_Replit {
    public static void main(String[] args) {

        class Main {

            public static void add_to_r(int[] arr, int n) {
                //create new array with one more position.
                int num [] = new int[arr.length+1];
                int index =0;
                for (int each: arr) {
                    num [index] =each;
                    index++;
                }

                System.out.println(Arrays.toString(num));
            }


            public static void main(String[] args) {
                Scanner inp = new Scanner(System.in);
                System.out.println("Enter the size of the Array!");
                int size = inp.nextInt();
                System.out.println("Enter the number to add into the Array");
                int n = inp.nextInt();
                int[] arr = new int[size];
                for(int i=0 ; i <=size-1; i++){
                    arr[i]=inp.nextInt();

                }
                inp.close();
                add_to_r(arr, n);
            }

        }


    /*
    add_to_r is a method that accepts an array and a number.

The method takes the same value of the array but adds the given number into the array at the end.
Note: The new number is added which means there is a size difference between the two arrays

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]
     */
    }
}
