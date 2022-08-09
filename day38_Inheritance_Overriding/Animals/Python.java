package day38_Inheritance_Overriding.Animals;



public class Python extends WildAnimal {


    public Python(String name, String breed, String color, char gender, int age, String size, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, age, size, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + "is hunting behind the river");
    }
}
