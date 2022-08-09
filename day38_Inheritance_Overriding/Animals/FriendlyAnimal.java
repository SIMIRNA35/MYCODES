package day38_Inheritance_Overriding.Animals;

public class FriendlyAnimal extends Animal {

   private boolean isWild ,isFriendly, isPlayable ;

   public FriendlyAnimal(String name, String breed, String color, char gender, int age, String size ,
                         boolean isWild , boolean isFriendly , boolean isPlayable) {
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

   public void play(){
       System.out.println(getColor() + getName() + "is playing ");
    }
    public void pet(){
       System.out.println(getName() + "is petting");
    }



}
/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */