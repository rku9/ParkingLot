package ParkingLot.controllers;

import ParkingLot.dto.IssueTicketRequestDto;
import ParkingLot.dto.IssueTicketResponseDto;
import ParkingLot.dto.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

import java.io.*;
import java.util.*;

public class TicketController {
    //this will have all the methods that client will need which are related to the "Ticket" model.

    //it will also have access to the TicketService as this will have all the logic of the methods here.
    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    //the following will be called in the Client. After that the request will come here and then will go to the service.
    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto){
        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
        try {
            Ticket ticket = ticketService.issueTicket(requestDto.getVehicleNumber(),
                    requestDto.getOwnerName(),
                    requestDto.getGateId(),
                    requestDto.getOperatorId());

            responseDto.setTicket(ticket);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
                responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}
