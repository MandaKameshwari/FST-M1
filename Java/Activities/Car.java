package activities;

public class Car {
 // created a clas with name car and have added variables in the car class   
String color;
String transmission;
int make ;
int tyres ;
int doors;

// creating a constructor 
Car() {
    tyres = 4;
    doors = 4;
}

        public void displayCharacteristics() {
            // to display characteristics of all variable
            System.out.println("Color of the car is - "+ color);
            System.out.println("Make of the car - "+ make);
            System.out.println("Transmission of the car - "+ transmission);
            System.out.println("Number of tyres of the car - "+ tyres);
            System.out.println("Number of Doors of the car - "+ doors);
}

        public void accelarate() {
            // method accelarate to print Car is moving forward
            System.out.println("Car is moving forward.");
        }

        public void brake() {
            // method to print Car has stopped
            System.out.println("Car has stopped.");
        }

}
