package day38_Inheritance_Overriding.Animals;

import day38_Inheritance_Overriding.Animals.FriendlyAnimal;

public class Dolphin extends FriendlyAnimal {

    public Dolphin(String name, String breed, String color, char gender, int age, String size, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, color, gender, age, size, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eating big fish ");

    }

    public void swim(){
        System.out.println(getName() + "is swimming");
    }
}
