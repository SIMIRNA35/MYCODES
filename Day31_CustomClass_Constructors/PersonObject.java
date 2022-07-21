package Day31_CustomClass_Constructors;

public class PersonObject {

    public static void main(String[] args) {

      Person person1 = new Person( "Daniel" ,'M', 32);

      Person person2 = new Person("Kader" , 'F' , 28);


      person2.age = 30 ; // to change one of the data you have to assigne the attribute that we wants to change


        System.out.println(person1);
        System.out.println(person2);


    }





}
