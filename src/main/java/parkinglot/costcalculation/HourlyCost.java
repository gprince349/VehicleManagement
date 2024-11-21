package parkinglot.costcalculation;

import parkinglot.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

public class HourlyCost implements CostStrategy{
    @Override
    public double getPrice(Ticket ticket) {
        LocalDateTime current = LocalDateTime.now();
        Duration duration = Duration.between(current, ticket.getEntryTime());
        return duration.toHours()*ticket.getParkingSpot().price();
    }
}
