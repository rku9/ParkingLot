package ParkingLot.models;

import java.io.*;
import java.util.*;

public class Bill extends BaseModel{
    private int number;
    private Ticket ticket;
    private int amount;
    private Date exitTime;
    private Gate gate;
    private Operator operator;

    //! getters and setters
    /*
    public int getGateNumber() {
        return number;
    }

    public void setGateNumber(int number) {
        this.number = number;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
     */

    //! method that follows the strategy pattern to calculate the bills for different vehicle type.


}
