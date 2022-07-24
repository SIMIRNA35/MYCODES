package day34_GarbageCollection_AccessModifiers;

import day32_ConstructorOverloading_Calls.Car;
import day33_CustomClass_Statics.Iphone;
import day33_CustomClass_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GarbageCollection {

    public static void main(String[] args) {

        /*//  int n = null :
        String str = null ;
        System.out.println(str.toUpperCase()); */

        String str = "Wooden Spoon" ; // after line 13 "Wooden Spoon will be eligible for garbage collection
       str = null ;

        System.out.println(str);


      Car car1 = new Car("Toyota");

      car1 = null ;

        System.out.println(car1);

      String language = "Python";
      language = "Java" ;

        System.out.println(language);

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;

      list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);


        System.out.println("----------------------------------");

        Student student1 = new Student("metin",'M',37,255,'A') ;
        student1.grade ='A' ;

        Student student2 = student1;
        student2.name = "Ahmet" ;

        System.out.println(student1);
        System.out.println(student2);


        System.out.println("------------------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();

        l1.add("java");

        ArrayList<String> l2 = new ArrayList<>();


        System.out.println("l1 = " + l1);

        System.out.println("l2 = " + l2);
    }




}
