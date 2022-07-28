package day35_Encapsulation.PracticeTasks;

public class TelevisionTest {
    public static void main(String[] args) {

       Television tv1 = new Television(20,5,true,"SAMSUNG");

        tv1.volumeDown();
        tv1.channelDown();
      //  System.out.println(tv1);

        System.out.println("----------------------------------------------------------");

        Television tv2 = new Television(84,5,false,"LG");

        tv2.channelUp();
        tv2.volumeUp();
        tv2.setVolumeLevel(1);
        tv2.turnOn();


       // System.out.println(tv2);

        System.out.println("----------------------------------------------------------------");

        Television tv3 = new Television(122,8,true,"VESTEL");

        tv3.channelUp();
        tv3.volumeUp();
        tv3.setVolumeLevel(1);

       // System.out.println(tv3);


    }









}
