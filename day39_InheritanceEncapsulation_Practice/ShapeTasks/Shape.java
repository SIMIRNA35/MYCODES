package day39_InheritanceEncapsulation_Practice.ShapeTasks;

public class Shape {
  private String name ;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Name can not be null");
            System.exit(1); // something went wrong
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }

    public double area(){
        return 0;
    }
    public double perimeter (){
      return 0;
    }

    }

/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}
 */