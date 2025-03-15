package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.io.*;
import java.util.*;

//all the data of the vehicle.
public class VehicleRepository {
    public Optional<Vehicle> findVehicleByNumber(String vehicleNumber){
        return Optional.empty();
    }

    //save fn to mimic the DB operation.
    public Vehicle save(Vehicle vehicle){
        return null;
    }
    //we will set the attributes in the service for the new vehicle and then save it in the database.
}
