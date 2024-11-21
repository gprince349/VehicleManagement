package parkinglot.parkingspot;

import parkinglot.ParkingStrategy;
import parkinglot.Vehicle;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        super(parkingSpotList, parkingStrategy);
    }

    @Override
    public ParkingSpot findSpace(Vehicle vehicle) {
        return parkingStrategy.getFreeSpace(super.parkingSpotList);
    }

}
