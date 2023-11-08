package vehiclesystem;

//The Car, Motorcycle, and Truck classes extend (inherit from) the Vehicle class.
// This means that they inherit all the attributes and methods of the Vehicle class.
// By using extends, the derived classes can reuse the common attributes and methods
// defined in the base class and can also add their own unique attributes and methods.
// This is an essential aspect of object-oriented programming, known as inheritance,
// which promotes code reuse and allows for the creation of specialized classes based on a common


public class Car extends Vehicle {
    private int numDoors;

    public Car(String manufacturer, String model, int year, int numDoors, int wheelCount) {
        super(manufacturer, model, year, wheelCount);
        this.numDoors = numDoors;
    }

    // Getters and setters

    public int getNumDoors() {
        return numDoors;
    }

    public void openDoor() {
        // Open door logic
    }

    public void checkForAccesss() {
        this.numDoors = 4;
        this.year = 1990;
        this.model = "Toyota"; // model was package-private so here it is accessible
//        this.manufacturer = "Tata"; private var of vehicle can't be accessed here too
    }

}