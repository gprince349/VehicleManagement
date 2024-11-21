package parkinglot;

import parkinglot.costcalculation.CostComputationFactory;
import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingspot.ParkingSpotManagerFactory;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1, "toyota", VehicleType.FOUR_WHEELER);

        EntryGate entryGate = new EntryGate(new ParkingSpotManagerFactory());
        ExitGate exitGate = new ExitGate(new ParkingSpotManagerFactory(), new CostComputationFactory());

        //while vehicle comes
        ParkingSpot parkingSpot = entryGate.findParkingSpace(vehicle);
        Ticket ticket = entryGate.bookSpot(parkingSpot, vehicle);

        //while vehicle goes
        double cost = exitGate.getCost(ticket);
        //payment => if yes update spot else nothing
        exitGate.updateParkingSpot(ticket);
    }
}
