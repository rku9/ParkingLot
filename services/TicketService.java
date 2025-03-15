package ParkingLot.services;

import ParkingLot.exceptions.GateNotFoundException;
import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.ParkingSpotAssignStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingSpotAssignStrategy parkingSpotAssignStrategy;
    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingSpotAssignStrategy parkingSpotAssignStrategy){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingSpotAssignStrategy = parkingSpotAssignStrategy;
    }


    //! main logic of ticket generation resides here.
    public Ticket issueTicket(String vehicleNumber,
                              String ownerName,
                              int gateId,
                              int OperatorId) throws GateNotFoundException {

        //all the attributes needed for this method will be passed through the dto object by the controller.
        // but the actual ticket object has different/more comprehensive attributes than the ones that are passed here.
        // to generate the ticket we somehow need the access to those attributes using the attributes passed through the dto. Only then we
        // can generate a ticket.

        // We would need to access the database and retrieve the actual object.
        // Use the gateRepo
        Ticket ticket = new Ticket(); //modifications to this and then return it.
        ticket.setEntryTime(new Date());

        //get the gate object
        Optional<Gate> optionalGate = gateRepository.findGateById(gateId);
        // if the gate above gets a null gate then the line below will give us a null pointer exception.
        //hence we use Optional in this fn logic in the gateRepo
        //and then use exception when it is empty.

        if(optionalGate.isEmpty()){
            throw new GateNotFoundException("Invalid gate");
        }

        Gate gate = optionalGate.get();
        int gateNumber = optionalGate.get().getGateNumber();


        ticket.setOperator(gate.getOperator());

        //use vehicle number to get the vehicle object.
        Optional<Vehicle> optionalVehicle = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle finalVehicle = optionalVehicle.isEmpty() ? null : optionalVehicle.get();
        if(optionalVehicle.isEmpty()){
            // vehicle is not present in the database
            // create a new vehicle and save it in the DB for future use.
            // if the vehicle with that number is present in the DB, then the optional will never be empty.
            Vehicle vehicle = new Vehicle();
            vehicle.setNumber(vehicleNumber);
            vehicle.setOwner(ownerName);
//            vehicle.setType();
//            Vehicle vehicle = optionalVehicle.get();
            finalVehicle = vehicleRepository.save(vehicle);
        }
        ticket.setVehicle(finalVehicle);

        //! setting the parking spot.
        //we can get the vehicle from the above.
        //we can get parking lot from the gate.
        Spot parkingSpotAssigned = parkingSpotAssignStrategy.assignSpot(gate.getParkingLot(), finalVehicle);

        return ticket;
    }
}
