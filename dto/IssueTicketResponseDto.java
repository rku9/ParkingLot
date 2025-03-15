package ParkingLot.dto;

import ParkingLot.models.Ticket;

import java.io.*;
import java.util.*;

public class IssueTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus; //! what is this
    //? If we don't get a response then we don't return a ticket and do something else.

    //getters and setters
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

}
