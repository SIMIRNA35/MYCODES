package day32_ConstructorOverloading_Calls;

public class Carpet {
    public double width, length, unitPrice;
    boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calCost() {
        double totalPrice = (width * length) * unitPrice;

        if (isPersian) {
            totalPrice += 200;

        }
        return totalPrice;
    }
            public String toString() {
                return "Carpet{" +
                        "width=" + width +
                        ", length= $ " + length +
                      ",isPersian=" + isPersian +
                      ", Total Price= $ " + calCost()+
                '}';
            }
        }

