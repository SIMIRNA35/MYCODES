package day38_Inheritance_Overriding.Animals;

import day38_Inheritance_Overriding.Animals.FriendlyAnimal;

public class Dog extends FriendlyAnimal {


    public Dog(String name, String breed, String color, char gender, int age, String size, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Dog", breed, color, gender, age, size, isWild, isFriendly, isPlayable);
    }
    public void bark(){
        System.out.println( getName() + " is barking");
    }

    @Override
    public void eat() {
        System.out.println( getName() + " is eating " + getBreed() + " in its garden" );
    }
}
