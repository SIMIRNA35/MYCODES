package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

import static utilities.MathUtility.sum;


public class StaticImport {


        public static void main(String[] args) {


            System.out.println(pi);
            System.out.println(Circle.name);
            System.out.println(Circle.numbers);

            System.out.println("------------------------------------------");

            int r1 = sum(10,20);

            System.out.println(r1);


            int r2 = sum(100,200);




        }

    }

