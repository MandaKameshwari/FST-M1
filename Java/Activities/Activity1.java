package activities;

public class Activity1 {
    public static void main(String[] args) {

     // create an object for the class Car
        Car nexon = new Car();
        nexon.make = 2014;
        nexon.color = "Black";
        nexon.transmission = "Manual";

    //calling methods accelarate(),brake() and displayCharacteristics() from car class
        nexon.accelarate();
        nexon.brake();
        nexon.displayCharacteristics();


        
    }


}
