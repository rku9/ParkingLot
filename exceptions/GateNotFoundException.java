package ParkingLot.exceptions;

import java.io.*;
import java.util.*;

public class GateNotFoundException extends Exception{
    public GateNotFoundException(String message){
        super(message);
    }
}
