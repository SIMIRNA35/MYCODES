package day36_OOPInheritanceIntro.SportsTask;

public class Football extends Sport {

    public int duration ;
    public  String mascot ;

    public void setInfo1 (int duration, String mascot) {

        this.duration = duration;
        this.mascot = mascot;
    }

     public void playing(){
         System.out.println(name + "is playing with Besiktas");
     }
    public String toString() {
        return "Football{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers = " + numberOfPlayers +
                ", numberOfReferre = " + numberOfReferre +
                "duration = " + duration +
                ", mascot='" + mascot + '\'' +
                '}';
    }
}








