package Day30_CustomClassIntro.Practice_Tasks;

public class Moto {

        public String brand ;
        public String model ;

        public int year ;
        public String color ;
        public double price ;

        public void setInfo (String Motobrand, String Motomodel, int Motoyear, String Motocolor, double Motoprice){
            brand = Motobrand ;
            model = Motomodel ;
            year = Motoyear ;
            color = Motocolor ;
            price = Motoprice;

        }

        public void drive(){
                System.out.println(brand + " " + model + " is faster than KLM ");
        }
        public void start(){
                System.out.println(brand + " " + model +  " has auto-start. ");

        }
        public void stop(){
            System.out.println(brand + " " +  model +  " has no auto-stop option. ");
        }

    public String toString() {
        return "Moto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=$"  + price +
                '}';
    }
}

/*
Attributes:
		brand, model, color, year, price

	Actions:
		drive(), start(), stop(), toString(), setInfo()

 */