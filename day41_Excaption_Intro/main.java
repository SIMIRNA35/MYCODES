package day41_Excaption_Intro;

public class main {


    public Test(){
        System.out.print("A");
    }
    public Test(int a){
        this(2.5);
        System.out.println("B");

 }
    public Test(double c) {
        this();
        System.out.println("C");
    }
        public static void main (String[]args){
            Test obj = new Test(100);
        }

    }






