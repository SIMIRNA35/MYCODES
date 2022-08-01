package day36_OOPInheritanceIntro.CryptoTokenTask;

public class CryptoToken {
    public double price;
    public int quantity ;
    public double marketCap,volume ;
    public String circulatingSupply ;
    public boolean isMineable ;


    public void setInfo(double price, int quantity, double marketCap, double volume, String circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }
     public double toTalPrice(){
        double toTalPrice = 0 ;

        toTalPrice = price * quantity ;
      return toTalPrice  ;
     }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply='" + circulatingSupply + '\'' +
                ", isMineable=" + isMineable +
                ", Total Price " + toTalPrice() +
                '}';
    }
}
/*
create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

 */