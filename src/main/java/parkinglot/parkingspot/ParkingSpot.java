package parkinglot.parkingspot;

import parkinglot.Vehicle;

public class ParkingSpot {
    private int id;
    private Vehicle vehicle;

    boolean isEmpty(){
        return vehicle != null;
    }

    void park(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    void remove(){
        this.vehicle = null;
    }

    public double price(){ //default price
        return 10.0;
    }
}
