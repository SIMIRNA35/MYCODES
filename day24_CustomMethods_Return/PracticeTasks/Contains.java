package day24_CustomMethods_Return.PracticeTasks;

public class Contains {
    public static void main(String[] args) {
 /*9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false
Ex:  arr = {1,2,3,4,5,6,7};  num = 10;    contains(arr, num) ===> false  */

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int element = 10;

        boolean contained = contains(arr, element);
        System.out.println(contained);


    }

    public static boolean contains(int[] arr, int element) {

        boolean containElement = false;

        for (int each : arr) {
            if (each == element) {
                containElement = true;

                break;
            }

        }
        return containElement;
    }

}





