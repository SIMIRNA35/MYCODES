package day38_Inheritance_Overriding.Animals;

public class Animal {
    private String name, breed, color;
    private char gender;
    private int age;
    private String size;

    public Animal(String name, String breed, String color, char gender, int age, String size) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setGender(gender);
        setAge(age);
       setSize(size);
    }

    public String getName() {  return name; }
    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return color;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getSize() {
        return size;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty() ){
            System.out.println("It is an error");
            System.exit(1);
        }

        this.name = name;
    }
    public void setBreed(String breed) {
        if (breed== null || breed.isBlank() || breed.isEmpty()) {
            System.out.println("It is an error");
            System.exit(1);
        }
            this.breed = breed;
    }
    public void setColor(String color) {

        if (color == null || color.isBlank() || color.isEmpty()) {
            System.out.println("It is an error");
            System.exit(1);

    }
        this.color = color;
    }
    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.exit(1);

        }

        this.gender = gender;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.exit(1);
        }
        this.age = age;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public void eat(){
        System.out.println( color + name + "is eating " + breed );
    }
    public void drink() {
        System.out.println(color + name + "is drinkin " + breed);
    }
    public void sleep() {
        System.out.println(color + name + "is sleeping " );
    }
    public void move() {
        System.out.println(color + name + "is moving ");
    }

    public String toString() {
        return "Animal{" +
                "name = ' " + " " + name + '\'' +
                ", breed = ' " + breed + '\'' +
                ", color =  '" + color + '\'' +
                ", gender = " + gender +
                ", age = " + age +
                ", size = ' " + size + '\'' +
                '}';
    }
}




/*

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()

 */