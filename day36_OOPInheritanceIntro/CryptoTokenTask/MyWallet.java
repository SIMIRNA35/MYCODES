package day36_OOPInheritanceIntro.CryptoTokenTask;

public class MyWallet {
    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin();
        bitcoin.setInfo(12.54,55,2.2,5.2,"Fast",true);
        System.out.println(bitcoin);

        System.out.println("--------------------------------");

        Cardano cardano = new Cardano();
        cardano.setInfo(10.54,51,1.2,3.2,"Fast",false);
        System.out.println(cardano);
        System.out.println("************************************************");

        Ethereum ethereum = new Ethereum();
        ethereum.setInfo(10.2,35,0.5,7.5,"Slow",true);
        System.out.println(ethereum);

        System.out.println("**********************************************");

        XRP xrp =new XRP();
        xrp.setInfo(8.98,98,3.6,4.5,"Fast",true);
        System.out.println(xrp);

        Doge doge = new Doge();
        doge.setInfo(14.5,65,2.4,6.5,"Slow",true);
        System.out.println(doge);

        bitcoin.toTalPrice();
        doge.toTalPrice();
        xrp.toTalPrice();
        ethereum.toTalPrice();
        cardano.toTalPrice();

        System.out.println(bitcoin );
        }










    }













/*
3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
 */
