package parkinglot;

import parkinglot.parkingspot.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {

    public ParkingSpot getFreeSpace(List<ParkingSpot> parkingSpotList);
}
