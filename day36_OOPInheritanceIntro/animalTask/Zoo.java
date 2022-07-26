package day36_OOPInheritanceIntro.animalTask;

public class Zoo extends Animal {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setInfo("Max","Husky",'M',2,"Small","Black");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();


        System.out.println(dog);

        Cat cat = new Cat();

        cat.setInfo("Kuki","British",'F',3,"Small","Yellow");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.meow();
        cat.scratch();
        System.out.println(cat);

        Fish fish= new Fish();

        fish.setInfo("Memo","Japon",'F',1,"Small","Red");

        fish.eat();
        fish.drink();
        fish.sleep();
        fish.move();
        fish.swim();

        System.out.println(fish);

        Tiger tiger = new Tiger();

        tiger.setInfo("Sher Khan","Bengal",'M',4,"Large","White");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);


    }

}
