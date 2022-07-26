package Day37_OOPInheritanceContinue_SuperKeyword.Animal;

public class Dog extends  Animal{

    public int a ; // this is own caracter of dog because of that we have to add seperately
    public Dog(String name, String breed, char gender, int age, String size, String color ,int a){

        // super keyword to call

        super(name,breed,gender,age,size,color);

        this.a = a; // added his oxn caracter
    }
    public void bark(){

    }
}
