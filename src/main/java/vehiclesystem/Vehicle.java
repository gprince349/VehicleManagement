package vehiclesystem;


class Vehicle {
    private String manufacturer; //'manufacturer' is private and cannot be accessed from outside the 'Vehicle' class
    String model; //no access modifier is specified for an attribute (field), method, or class, it has default access, also known as package-private access.
    public int year; //public acess

    protected Integer wheelCount;

    public Vehicle(String manufacturer, String model, int year, int wheelCount) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.wheelCount = wheelCount;
    }

    public Vehicle(){}

    // Getters and setters

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void accelerate() {
        // Acceleration logic
    }

    public void brake() {
        // Braking logic
    }
}


//Protected class member (method or variable) is just like package-private (default visibility),
// except that it also can be accessed from subclasses.
// Since there's no such concept as 'subpackage' or 'package-inheritance' in Java, declaring
// class protected or package-private would be the same thing.
// You can declare nested and inner classes as protected or private, though.