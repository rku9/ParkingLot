package ParkingLot.models;

import java.io.*;
import java.util.*;

public class Spot extends BaseModel{
    private ParkingSpotStatus status;
    private VehicleType forType; // for which kind of vehicle that spot is.
    private int number; //identifier for the humans.
    private Floor floor;
    //! do we need the floor on which this spot is?


    public VehicleType getForType() {
        return forType;
    }

    public void setForType(VehicleType forType) {
        this.forType = forType;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingSpotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingSpotStatus status) {
        this.status = status;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
