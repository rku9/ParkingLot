package ParkingLot.repositories;

import ParkingLot.models.Gate;

import java.io.*;
import java.util.*;

public class GateRepository {
    //the following can be seen as a gate table.
    private Map<Integer, Gate> gates = new HashMap<>();
    //id will be the key.

    //CRUD operations on the GATE TABLE.
    //similar to: select * from gates where id = '';
    public Optional<Gate> findGateById(Integer id){
        return Optional.of(gates.get(id));
    }
}
