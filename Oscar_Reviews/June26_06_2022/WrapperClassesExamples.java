package Oscar_Reviews.June26_06_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperClassesExamples {
    public static void main(String[] args) {

               int i1 = 100; // primitive

                Integer i2; // object   Scanner scan = new Scanner...

                // auto-boxing Examples
                i2= i1; // automatically the data enlarge itself from primitive to Object
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(i1);// automatically the data enlarge itself from primitive to Object
                arrayList.add(i2);
                System.out.println("---Arraylist---");
                System.out.println("arrayList = " + arrayList);

                Integer n1 = 300;
                int n2 = n1; // un-boxing to primitive
                n2 = arrayList.get(1); // getting an Object from arrayList and assigning to primitive : un-boxing

                String searchResult = "1-48 of over 6000 results for java";
                String[] arr = searchResult.split(" ");
                System.out.println(Arrays.toString(arr));

                int resultAsPrimitive = Integer.parseInt(arr[3]);
                System.out.println(resultAsPrimitive+1);

            }
        }





