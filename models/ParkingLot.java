package ParkingLot.models;

import java.io.*;
import java.util.*;

public class ParkingLot extends BaseModel{
    private List<Floor> floors;
    private List<Gate> gates;
    private List<VehicleType> supportedTypes;
    private List<Ticket> tickets;   //! why is this needed?

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getSupportedTypes() {
        return supportedTypes;
    }

    public void setSupportedTypes(List<VehicleType> supportedTypes) {
        this.supportedTypes = supportedTypes;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
