package parkinglot;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingspot.ParkingSpotManager;
import parkinglot.parkingspot.ParkingSpotManagerFactory;

public class EntryGate {

    ParkingSpotManagerFactory parkingSpotManagerFactory;

    public EntryGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }
    //vehicle -> findSpace -> bookspot -> generateTickets

    public ParkingSpot findParkingSpace(Vehicle vehicle){
        ParkingSpotManager parkingSpotManager = this.parkingSpotManagerFactory.get(vehicle.getType());
        return parkingSpotManager.findSpace(vehicle);
    }

    public Ticket bookSpot(ParkingSpot parkingSpot, Vehicle vehicle){
        ParkingSpotManager parkingSpotManager = this.parkingSpotManagerFactory.get(vehicle.getType());
        parkingSpotManager.park(parkingSpot, vehicle);
        return generateTicket(vehicle, parkingSpot);
    }

    private Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        return new Ticket(vehicle, parkingSpot);
    }

}
