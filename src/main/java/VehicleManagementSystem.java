import vehiclesystem.Car;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create instances of Car, Motorcycle, and Truck objects
        Car car = new Car("Toyota", "Camry", 2021, 4,4);
        System.out.println(car.getManufacturer());
        System.out.println(car.year);

        //System.out.println(car.manufacturer); // Error: 'manufacturer' is private and cannot be accessed from outside the 'Vehicle' class
        //System.out.println(car.model); //// Error: 'model' is package-private(default) and cannot be accessed from outside package
    }
}


