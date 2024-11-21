package parkinglot.costcalculation;

import parkinglot.Ticket;

public class CostComputation {
    CostStrategy costStrategy;

    public CostComputation(CostStrategy costStrategy) {
        this.costStrategy = costStrategy;
    }

    public double getCost(Ticket ticket){
        return costStrategy.getPrice(ticket);
    }
}
