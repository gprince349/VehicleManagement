package parkinglot.costcalculation;

import parkinglot.VehicleType;

public class CostComputationFactory {

    public CostComputation get(VehicleType type){
        return switch (type){
            case TWO_WHEELER -> new TwoWheelerCostComputation(null);
            case FOUR_WHEELER -> new FourWheelerCostComputation(null);
        };
    }
}
