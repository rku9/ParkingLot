package ParkingLot.strategies;

import ParkingLot.models.ParkingLot;
import ParkingLot.models.Spot;
import ParkingLot.models.Vehicle;

public interface ParkingSpotAssignStrategy {
    Spot assignSpot(ParkingLot parkingLot, Vehicle vehicle);
}
