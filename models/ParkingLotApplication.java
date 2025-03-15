package ParkingLot.models;

import ParkingLot.controllers.TicketController;
import ParkingLot.factories.ParkingLotAssignStrategyFactory;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;
import ParkingLot.strategies.ParkingSpotAssignStrategy;

import java.io.*;
import java.util.*;

public class ParkingLotApplication {

    public static void main(String[] args) {
        //we have implemented one method and, we have to call that here.
        //we have to create the objects of the required dependencies in the order.
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingSpotAssignStrategy parkingSpotAssignStrategy = ParkingLotAssignStrategyFactory.getSpecificStrategy(ParkingSpotType.CLOSEST);
        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingSpotAssignStrategy);
        TicketController ticketController = new TicketController(ticketService);
    }
}
