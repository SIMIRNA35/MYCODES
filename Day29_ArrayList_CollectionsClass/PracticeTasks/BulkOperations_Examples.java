package Day29_ArrayList_CollectionsClass.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Examples {

    public static void main(String[] args) {
        //  asList(array of values) ===> returns the array as collectionType  !!!! IMPORTANT


        // removeAll(CollectionType): removes all the matching elements from the arraylist

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(75, 87, 95, 64, 25, 28, 29, 78, 98, 24, 55, 4, 4, 5, 6, 879));

        System.out.println(list);

        list.removeAll(Arrays.asList(64, 25, 879));

        System.out.println(list);

        // retainAll(Collection type) = removes all the non-matching elements from the arraylist

        System.out.println("--------------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(120, 579, 457, 89, 7, 7, 5, 44, 6, 5, 123, 456, 789));

        numbers.retainAll(Arrays.asList(120, 579, 457, 123));

        System.out.println(numbers);

        System.out.println("------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA", "SDET", "DEVELOPER", "Scrum Master", "Product Owner"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

        System.out.println("---------------------------------------------");

        // containsAll(CollectionType): checks if all the elements are contained in the arraylist

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(21, 22, 23, 24, 25, 26, 27, 28, 29));

        boolean n1 = nums.contains(21);

        boolean n2 = nums.contains(23) && nums.contains(27) && nums.contains(29);

        boolean n3 = nums.containsAll(Arrays.asList(25, 26, 27));


        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);

        System.out.println("--------------------------------------------");

        // to convert non primitive array into the arraylist

        String[] names = {"Metin", "Hasan", "Akile", "Elif", "Erva"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names)); // this is the second way

        /* this is one way to convert
        namesList.addAll((Arrays.asList(names))) ; */

        System.out.println(namesList);

        // to convert primitive array into the arraylist

        Integer[] arr = {7, 8, 9, 4, 5, 6, 1, 2, 3};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);



        int[] arr2 = {7, 8, 9, 4, 5, 6, 1, 2, 3};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3);


    }

 public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

     for (int each : array) {
         list.add(each);
     }
         
     return list;
    }
}
