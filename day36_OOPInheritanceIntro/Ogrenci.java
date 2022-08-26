package day36_OOPInheritanceIntro;

public class Ogrenci {
     /* 1) What is Encapsulation?
    // Encapsulation : DATA HIDING and is a data storage method used to protect sensitive data */
    private String	name;            //2) How do we store data?
    private int  age ;                          //We store data using private access modifier.
    private char gender,grade;
    private String  schoolName ;

    public Ogrenci(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }
    /* 3) Can we access the stored data from other classes?
     Yes. We can reach it using getter and setter methods */

   /* 4) What does the getter(Read only) method do.
   It allows us to read the stored data. */

    public String getName(){return name ;}
    public int getAge(){return age;}          // Public instance method Return type is not void.
    public char getGender(){return gender;}   //  *** Return whatever the value is being assigned to the private value
    public char getGrade(){return grade;}
    public String getSchoolName(){return schoolName;}


    /* 5) What does the setter(Write Only) method do?
     It allows us to update the stored data through the object. */

    public void setName(String name){    //  Public Instance Method

        this.name =name ; }

    public void setAge(int age){        //  Return type is void

        if (age < 5 || age > 90){       //1. age should not be set less than 5 or greater than 90
             return;  }

        this.age =age ; }

    public void setGender(char gender){    //Parameter' data type must match with private instance variable' data type

     if ( !(gender == 'M' || gender == 'F') ) { //2. gender should not be set to any chanarcter other than: 'M' and 'F'
               return; }

        this.gender =gender;}

    public void setGrade(char grade){   // *** Reassigns the private instance variable to given argument

   if (!(grade == 'A'||grade == 'B' || grade == 'C'||grade == 'D' || grade == 'F'))

            return;

        this.grade =grade; }     //3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

    public void setSchoolName(String schoolName){

        this.schoolName =schoolName;}


     public void study(){

        System.out.println( name + "is a " + gender + "and "+ age +"years old.He studied very hard and graduated from"
     + schoolName + "with high" + grade + "." ); }

    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    /*
    1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()
     */










}
