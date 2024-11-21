package parkinglot.parkingspot;

import parkinglot.ParkingStrategy;
import parkinglot.Vehicle;

import java.util.List;

public abstract class ParkingSpotManager {

    protected List<ParkingSpot> parkingSpotList;
    ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList,ParkingStrategy parkingStrategy) {
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }

    public boolean addParkingSpace(ParkingSpot parkingSpot){
        return this.parkingSpotList.add(parkingSpot);
    }

    public boolean removeParkingSpace(ParkingSpot parkingSpot){
        return this.parkingSpotList.remove(parkingSpot);
    }

    public abstract ParkingSpot findSpace(Vehicle vehicle);
    public  void park(ParkingSpot parkingSpot, Vehicle vehicle){
        parkingSpot.park(vehicle);
    }

    public  void unPark(ParkingSpot parkingSpot, Vehicle vehicle){
        parkingSpot.remove();
    }

}
