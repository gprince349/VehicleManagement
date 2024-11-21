package parkinglot.parkingspot;

import parkinglot.DefaultParkingStrategy;
import parkinglot.VehicleType;

import java.util.Collections;

public class ParkingSpotManagerFactory{

    public ParkingSpotManagerFactory() {
    }

    public ParkingSpotManager get(VehicleType type){
       return switch (type){
           case FOUR_WHEELER -> new FourWheelerParkingSpotManager(Collections.emptyList(), new DefaultParkingStrategy());
           case TWO_WHEELER -> new FourWheelerParkingSpotManager(Collections.emptyList(), null);
       };
    }
}
