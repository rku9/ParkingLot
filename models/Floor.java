package ParkingLot.models;

import java.io.*;
import java.util.*;

public class Floor extends BaseModel{
    private int floorNumber;
    private List<Spot> parkingSpots;
    private Status status;
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<Spot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<Spot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
