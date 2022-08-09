package day38_Inheritance_Overriding.Animals;

import day38_Inheritance_Overriding.Animals.Animal;

public class WildAnimal extends Animal {

    private boolean isWild ,isFriendly, isPlayable ;

    public WildAnimal(String name, String breed, String color, char gender, int age, String size, boolean isWild ,boolean isFriendly ,boolean isPlayable) {
        super(name, breed, color, gender, age, size);
        setWild(isWild);
        setFriendly(isFriendly);
        setPlayable(isPlayable);
    }


    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }
    public void hunt(){
        System.out.println(getName() + " is hunting ");
    }

    public String toString() {
        return "WildAnimal{" +
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */