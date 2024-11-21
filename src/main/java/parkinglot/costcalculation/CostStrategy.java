package parkinglot.costcalculation;

import parkinglot.Ticket;

public interface CostStrategy {

    double getPrice(Ticket ticket);
}
