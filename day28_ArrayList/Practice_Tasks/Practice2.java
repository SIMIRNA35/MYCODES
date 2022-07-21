package day28_ArrayList.Practice_Tasks;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);
        list.add(1000);

        System.out.println(list);

      /*   int num = 1 ;

        list.remove(num);
        System.out.println(list); */

        Integer num = 500;

        boolean r = list.remove(num);

        System.out.println(list);
        System.out.println(r);

        System.out.println("-------------------------------");

        System.out.println(list.size());

        list.clear();

        System.out.println(list.size());

        System.out.println(list);

        System.out.println("-------------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int i = characters.indexOf('A'); // 0
        int b = characters.lastIndexOf('A');

        System.out.println(i);
        System.out.println(b);


    }

}
