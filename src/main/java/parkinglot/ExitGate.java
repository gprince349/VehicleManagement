package parkinglot;

import parkinglot.costcalculation.CostComputation;
import parkinglot.costcalculation.CostComputationFactory;
import parkinglot.parkingspot.ParkingSpotManager;
import parkinglot.parkingspot.ParkingSpotManagerFactory;

public class ExitGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    CostComputationFactory costComputationFactory;
    //getCost

    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory, CostComputationFactory costComputationFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
        this.costComputationFactory = costComputationFactory;
    }

    public double getCost(Ticket ticket){
        //2 wheeler cost calc or 4 wheeler cost calc => make two cost calc class and from factory use here
        VehicleType type = ticket.vehicle.getType();
        CostComputation costComputation = this.costComputationFactory.get(type);
        return costComputation.getCost(ticket);
    }

    public void updateParkingSpot(Ticket ticket){
        ParkingSpotManager parkingSpotManager = this.parkingSpotManagerFactory.get(ticket.vehicle.getType());
        parkingSpotManager.unPark(ticket.parkingSpot, ticket.vehicle);
    }
}
