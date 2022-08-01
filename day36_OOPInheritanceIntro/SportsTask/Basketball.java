package day36_OOPInheritanceIntro.SportsTask;

public class Basketball extends Sport{
    public int duration ;
    public int maxFauls ;


    public void setInfo1(int duration, int maxFauls) {
        this.duration = duration;
        this.maxFauls = maxFauls;
    }

        public void  dribbling(){
        System.out.println( name  + "is dribbling. ");

    }

    public void rebounding(){
        System.out.println(name + " has rebounded. ");

    }

    public String toString() {
        return "Basketball{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers = " + numberOfPlayers +
                ", numberOfReferre = " + numberOfReferre +
                "duration=" + duration +
                ", maxFauls=" + maxFauls +
                '}';
    }
}





