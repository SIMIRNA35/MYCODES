package Day37_OOPInheritanceContinue_SuperKeyword.Animal;

import java.util.concurrent.Callable;

public class AnimalObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Husky", 'M', 2, "Small", "Black");
        System.out.println(dog1);

        dog1.bark();
        // dog1.scratch();

        Cat cat1 = new Cat("Kuki","British",'F',3,"Small","Yellow");

        System.out.println(cat1);

        cat1.scratch();

        Parrot parrot1 = new Parrot("Alex","Cool",'F',2,"Small","Red");

        System.out.println(parrot1);

        parrot1.sing();











    }


}

