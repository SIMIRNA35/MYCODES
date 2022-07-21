package day24_CustomMethods_Return.PracticeTasks;

import java.util.Arrays;

public class Reversed_2Arrays {
    public static void main(String[] args) {
/*8. Create method named reverse that passes an integer array parameter, the method can return the reversed array
Ex:	arr = {10, 20, 30, 40};	reverse(arr) ==> {40, 30, 20, 10} */

        int [] arr = {10, 20, 30, 40};
        int [] toreverse = reversed(arr);

        System.out.println(Arrays.toString(toreverse));


    }
    public static int [] reversed( int [] arr) {

        int []result = new int[arr.length];

        for (int i = arr.length-1 ,  j = 0 ; i >= 0 ; i-- ,j++) {
            result [j] += arr[i];

        }





          return result ;

    }

}
