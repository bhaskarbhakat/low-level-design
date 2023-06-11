package com.ParkingLot.controllers;

import com.ParkingLot.dtos.CreateTicketRequestDto;
import com.ParkingLot.dtos.CreateTicketResponseDto;
import com.ParkingLot.model.Ticket;
import com.ParkingLot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    // 1. generate Ticket
    public CreateTicketResponseDto createTicket(CreateTicketRequestDto request){
        Ticket ticket = ticketService.createTicket(request.getVehicle(), request.getGate());
    
        CreateTicketResponseDto responseDto = new CreateTicketResponseDto();
        responseDto.setTicket(ticket);

        return responseDto;
    }

    // 2. update Ticket
    // 3. get Ticket
    // 4. delete Ticket

}
