package parkinglot;

import parkinglot.parkingspot.ParkingSpot;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    String id;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    LocalDateTime entryTime;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.id = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
