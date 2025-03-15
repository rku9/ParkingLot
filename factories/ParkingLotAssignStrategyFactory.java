package ParkingLot.factories;

import ParkingLot.models.ParkingSpotType;
import ParkingLot.strategies.ClosestSpotAssignStrategy;
import ParkingLot.strategies.ParkingSpotAssignStrategy;

public class ParkingLotAssignStrategyFactory {
    public static ParkingSpotAssignStrategy getSpecificStrategy(ParkingSpotType strategyType){
        if(strategyType==ParkingSpotType.CHEAPEST){
            return new ClosestSpotAssignStrategy();
        }
//        else if(strategyType==ParkingSpotType.CLOSEST){
//        }
        return null;
    }
}
