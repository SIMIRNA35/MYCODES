package day_35_Encapsulation;

public class Task_Circle {

    private double radius ;

    public static double Pi = 3.14;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0 ){
            return;
        }


        this.radius = radius;
    }
    public Task_Circle(double radius){
        setRadius(radius);
    }

    public String toString() {
        return "Task_Circle{" +
                " radius = " + radius +
                " calcArea =  " + calcArea() +
                " calcPerimetre = " + calcPerimeter()+
                '}';
    }

    public double calcArea() {
        return Pi * radius * radius;

    }
    public double calcPerimeter() {
        return 2 * Pi * radius ;

    }


    }











/*
2. Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */