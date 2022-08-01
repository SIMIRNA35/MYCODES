package day36_OOPInheritanceIntro.SportsTask;

public class Sport {

   public String name , rules ;
   public int numberOfPlayers, numberOfReferre ;

    public void setInfo(String name, String rules, int numberOfPlayers, int numberOfReferre) {
        this.name = name;
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferre = numberOfReferre;
    }

    public void play(){
        System.out.println("He like playing " + name);
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers = " + numberOfPlayers +
                ", numberOfReferre = " + numberOfReferre +
                '}';
    }
}
 /*
 1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules



			methods:
				setInfo()
				play()
				toString()

  */