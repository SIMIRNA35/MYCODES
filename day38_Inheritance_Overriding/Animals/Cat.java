package day38_Inheritance_Overriding.Animals;

import day38_Inheritance_Overriding.Animals.FriendlyAnimal;

public class Cat extends FriendlyAnimal {


    public Cat(String name, String breed, String color, char gender, int age, String size, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Cat", breed, color, gender, age, size, isWild, isFriendly, isPlayable);
    }

        public void scratch(){
       System.out.println(getColor() + getName() + " is scratching everybody very bad");}

       public void meow(){
        System.out.println(getColor() + getName() + " is meowing");

    }

    @Override
    public void eat() {
        System.out.println( getName() + " is eating cats meals");    }
}
