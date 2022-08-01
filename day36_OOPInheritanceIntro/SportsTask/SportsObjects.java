package day36_OOPInheritanceIntro.SportsTask;

public class SportsObjects {
    public static void main(String[] args) {

        Football football = new Football();
        football.setInfo("Gs"," Players",11,3);
        football.setInfo1(90,"ASLAN");
        football.playing();
        System.out.println(football);

        System.out.println("**************************");

        Basketball basketball = new Basketball();

        basketball.setInfo("Ulker","attaion" , 10,3);
        basketball.setInfo1(60,4);
        basketball.dribbling();
        basketball.dribbling();
        System.out.println(basketball);

        System.out.println("**************************");

        Baseball baseball1 = new Baseball();
        baseball1.setInfo("Efes","Strict",9,2);
        baseball1.setInfo1(9,3);
        baseball1.runnig();
        System.out.println(baseball1);

    }
}
