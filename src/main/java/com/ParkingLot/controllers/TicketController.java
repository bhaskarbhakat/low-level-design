package com.ParkingLot.controllers;

import com.ParkingLot.dtos.CreateTicketRequestDto;
import com.ParkingLot.dtos.CreateTicketResponseDto;
import com.ParkingLot.dtos.DeleteTicketRequestDto;
import com.ParkingLot.dtos.DeleteTicketResponseDto;
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
        if(ticket == null){
            System.out.println("Parking Lot Full");
            return null;
        }
        CreateTicketResponseDto responseDto = new CreateTicketResponseDto();
        responseDto.setTicket(ticket);

        return responseDto;
    }

    // 2. update Ticket
    // 3. get Ticket

    // 4. delete Ticket
    public DeleteTicketResponseDto deleteTicket(DeleteTicketRequestDto request){
        Ticket ticket = ticketService.deleteTicket(request.getTicketId());
        if(ticket == null){
            System.out.println("Invalid Ticket");
            return null;
        }
        
        DeleteTicketResponseDto response = new DeleteTicketResponseDto();
        response.setVehicle(ticket.getVehicle());
        System.out.println("Unparked vehicle with Registration Number: " + ticket.getVehicle().getNumber() + " and Color: " + ticket.getVehicle().getColor());

        return response;
    }

}
