package Day31_CustomClass_Constructors;

public class Carpett {

    private double width, length, unitPrice;
    private boolean isPersian;

    public Carpett(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            System.out.println("Invalid width " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if (length < 0){
            System.out.println("Invalid length " + length);
        System.exit(1);

    }
        this.length = length;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }

    public double calcCost() {
        double totalPrice = (width * length) * unitPrice;

        if (isPersian){
            totalPrice += 200 ;

        }


        return totalPrice;
    }

    public String toString() {
        return "Carpett{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total=" + calcCost() +
                '}';
    }
}







  /*
    5. Carpet Task:
	5.1create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

		Add a constructor to set all the instances

                instance methods:

                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

     */




