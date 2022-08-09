package day38_Inheritance_Overriding.Animals;

public class Zoo {
    public static void main(String[] args) {

     //   FriendlyAnimal friendlyAnimal = new FriendlyAnimal("Dog","Meat","Black" , 'M',3,"Large",false,
         //       true,true);

      //  WildAnimal wildAnimal = new WildAnimal("Tiger","Deer" ,"white",'F',2, "Small",true,false,false);

      //  wildAnimal.hunt();


      //  System.out.println(friendlyAnimal);

           Dog dog = new Dog("Oscar","Kemik","Black",'M',5,"Large",false,true,true);

           dog.eat();
           dog.bark();

        System.out.println(dog);

        Cat cat = new Cat("Kuki","mouse","Yellow",'F',2,"Small",false,true,true);

        cat.eat();
        cat.meow();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger("Leo","Bouffalo","White",'M',4,"Small",true,false,false);

        tiger.hunt();



    }







}
