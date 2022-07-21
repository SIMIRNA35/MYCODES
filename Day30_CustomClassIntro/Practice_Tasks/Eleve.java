package Day30_CustomClassIntro.Practice_Tasks;

public class Eleve {

       public String name;
        public char gender;
        public int age;
        public int ID;

        public char grade;

        public void setInfo(String name, char gender, int age, int ID, char grade) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.ID = ID;
            this.grade = grade;
        }

    public String toString() {
        return "Eleve{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }



        public void play() {
            System.out.println(name + " is playin board-games.");}

        public void sleep() {
            System.out.println(name + " is sleeping now.");}
    }






