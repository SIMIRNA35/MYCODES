package day28_ArrayList.Practice_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class klm {
    public static void main(String[] args) {
       /* ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        Integer a = 1 ;
        list1.remove(a);
        System.out.println(list1);*/

       /* ArrayList<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add(3,"cyan");

        System.out.println(colors);*/

        ArrayList<Integer> list1 = new ArrayList<>();
       /*list1.addAll(Arrays.asList(1,2,3,4,5));

       list1.set(0, list1.get(4));
       list1.set(4, list1.get(0));

        System.out.println(list1);*/
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7));
        for (Integer each : list1) {
            if (each % 2 != 0){
                continue;
            }

            System.out.println(each+"");
            break;
            }
        }

    }
