package day24_CustomMethods_Return.PracticeTasks;

public class MinimumNumberArray {
    public static void main(String[] args) {
        //3. create a method that can return the minimum number from an array of integers

        int[] givenNumber = {543, 968, 374, 366, 245, 842, 153, 456, 321};

        int minimumNumber = minimumFromArray(givenNumber);
        System.out.println("minimumNumber = " + minimumNumber);
    }

    public static int minimumFromArray(int[] number) {

        int min = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] < min) {

                min = number[i];
            }
        }
        return min ;
    }
}

