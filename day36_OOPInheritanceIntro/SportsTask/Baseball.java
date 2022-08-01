package day36_OOPInheritanceIntro.SportsTask;

public class Baseball extends  Sport{
    public int numberOfinnings ;
    public int duration ;

    public void setInfo1(int numberOfinnings, int duration) {
        this.numberOfinnings = numberOfinnings;
        this.duration = duration;
    }

    public void runnig () {
        System.out.println( name + "is runnig fast");
    }

    public String toString() {
        return "Baseball{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers = " + numberOfPlayers +
                ", numberOfReferre = " + numberOfReferre +
                "numberOfinnings=" + numberOfinnings +
                ", duration=" + duration +
                '}';
    }
}
