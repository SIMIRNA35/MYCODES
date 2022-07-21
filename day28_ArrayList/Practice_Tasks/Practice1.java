package day28_ArrayList.Practice_Tasks;

import java.util.ArrayList;

public class Practice1 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        System.out.println(list);

        System.out.println(list.get(3));

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }

            System.out.println(list);



        }



    }

