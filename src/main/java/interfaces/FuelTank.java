package interfaces;

//Java allows a class to implement multiple interfaces. For example,
// you can create another interface, FuelTank, with methods related to fuel:
//A class can implement both the Engine and FuelTank interfaces, providing
// implementations for all methods defined in both interfaces.

public interface FuelTank {
    void refuel(double amount);
    double getFuelLevel();

    //Java interfaces can also have static methods, which can be called on the interface itself, not on implementing classes.
    // They are typically used for utility methods related to the interface.
    static double calculateMilesPerGallon(double milesDriven, double fuelConsumed) {
        return milesDriven / fuelConsumed;
    }

}
