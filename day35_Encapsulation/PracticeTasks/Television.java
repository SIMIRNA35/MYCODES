package day35_Encapsulation.PracticeTasks;

public class Television {
    private int channell =1 ;   /* 1) What is Encapsulation?
                               // Encapsulation : DATA HIDING and is a data storage method used to protect sensitive data */
    private int volumeLevell=0;
    private boolean on = false ;  //2) How do we store data? //We store data using private access modifier.
    private String brand = "undefined";

    /* 3) Can we access the stored data from other classes?
     Yes. We can reach it using getter and setter methods */



    public Television(int channell, int volumeLevell, boolean on, String brand) {
        setChannel(channell);
        setVolumeLevel(volumeLevell);
        setOn(on);
        setBrand(brand);

    }

    /* 4) What does the getter(Read only) method do.
    It allows us to read the stored data. */

    public int getChannel() { return channell;}

    public void setChannel(int channell) {
        if (on && channell >= 1 && channell <= 120) {
            channell = channell;
        }
        this.channell = channell;
    }

    public int getVolumeLevel() { return volumeLevell;}

    /* 5) What does the setter(Write Only) method do?
         It allows us to update the stored data through the object. */

    public void setVolumeLevel(int volumeLevell) {   // *** Reassigns the private instance variable to given argument

        if (volumeLevell <= 0 || volumeLevell >= 7){

            System.out.println( "ERROR: TV is either OFF or invalid Channel.");
            System.exit(1);
        }
        this.volumeLevell = volumeLevell;

    }

    public boolean isOn() {return on; }

    public void setOn(boolean on) {
         this.on = on;
    }
    public  String getBrand() {  return brand;}

    public void setBrand(String brand) {
        this.brand =brand ;
    }

    public void channelUp() {
        if (channell > 100);

        channell++;

    }
    public void channelDown(){
        if (channell > 1);

        channell--;
    }

    public void volumeUp() {

        if (on  && volumeLevell < 7) {
            volumeLevell++;

        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }
    public void volumeDown() {

        if (on && volumeLevell > 1){
            volumeLevell--;
        }else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }

    public void turnOn(){

         on = true ;

        System.out.println("TV is already ON");
    }
    public void turnOff(){

        on = false ;
        System.out.println("TV is already OFF");
    }

    public String toString() {
        return "Television{" +
                "channel=" + channell +
                ", volumeLevel=" + volumeLevell +
                ", on=" + on +
                ", brand='" + brand + '\'' +
                '}';
    }


/*
    Write a custom class TV that has 4 instance variables:

int channel=1, int volumeLevel=0, boolean on = false, String brand = "undefined".

Create one no arguments constructor that prints message: "Creating TV object using no args-constructor".

Also, create one more constructor that defines instance variable brand,
and displays message:"Creating TV object using 1 arg - constructor".

Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel)
and brand (getBrand/setBrand) instance variables.


Declare methods channelUp() to increase variable channel by one,  ok
and channelDown() to decrease variable channel by one.            ok

Declare methods volumeUp() to increase variable volume by one, a  ok
and volumeDown() to decrease variable volume by one.              ok

Create isOn(), turnOn() and turnOff() methods for on instance variable. ok

 If tv is already on, no need to turn it on again, display message: "TV is already ON".

 If tv is already off, then no need to turn it off again, display message: "TV is already OFF".
Value of a variable channel cannot be negative or zero, and cannot be higher than 120.

If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
Volume can only be in the range between 0 and 7. You may change volume only if TV is on.

Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level". Use isOn() method that will check tv status.
     */
}