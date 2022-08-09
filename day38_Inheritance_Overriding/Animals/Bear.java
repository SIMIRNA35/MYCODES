package day38_Inheritance_Overriding.Animals;

import day38_Inheritance_Overriding.Animals.WildAnimal;

public class Bear extends WildAnimal {


    public Bear(String name, String breed, String color, char gender, int age, String size, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, age, size, isWild, isFriendly, isPlayable);

    }

    @Override
    public void hunt() {
        System.out.println(getName() + "is hunting like a snake");
    }
}
