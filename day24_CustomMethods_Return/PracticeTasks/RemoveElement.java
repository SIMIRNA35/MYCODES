package day24_CustomMethods_Return.PracticeTasks;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
/*10. create a method named removeElement that passes one integer array and one integer, the method removes the integer
index from the integer array and returns the new array

Ex: array = {10, 20, 30, 40, 50, 60} index = 2      removeElement(array, index) ==== {10, 20, 40, 50, 60}


      int array = {10, 20, 30, 40, 50, 60}; */


        int [] array = {10, 20, 30, 40, 50, 60} ;
        int index = 2;
                System.out.println(Arrays.toString(removeElement(array,index)));
    }
    public static int[]removeElement(int []intArr,int index){
    int []newArr = new int[intArr.length-1]; // nw array has 1 element less
        for (int i = 0; i < index; i++) {
            newArr[i] = intArr[i];

        }
        for (int i = index+1; i < intArr.length ; i++) { // new arrays indexes after removal will be one less

            newArr[i-1] = intArr[i]; // 10,20,40,50,60
        }


    return newArr;
    }

}











