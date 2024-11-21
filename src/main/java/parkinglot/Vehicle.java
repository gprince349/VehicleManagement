package parkinglot;


public class Vehicle {
    private int number;
    private String name;
    private VehicleType type;

    public Vehicle(int number, String name, VehicleType type) {
        this.number = number;
        this.name = name;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public VehicleType getType() {
        return type;
    }

}
