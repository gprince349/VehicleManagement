package parkinglot;

import parkinglot.parkingspot.ParkingSpot;

import java.util.List;

public class DefaultParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot getFreeSpace(List<ParkingSpot> parkingSpotList) {
        return parkingSpotList.get(0);
    }
}
