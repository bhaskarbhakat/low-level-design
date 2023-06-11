package com.ParkingLot.services;

import java.util.Date;

import com.ParkingLot.model.Gate;
import com.ParkingLot.model.Ticket;
import com.ParkingLot.model.Vehicle;
import com.ParkingLot.repository.TicketRepository;

public class TicketService {
    private TicketRepository ticketRepository;
    
    public TicketService(TicketRepository ticketRepository){
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(Vehicle vehicle, Gate gate){
        // 1. check if any free slots available for a particular vehicle type
        // 2. find Slots of for a particular vehicle type
        // 3. set Ticket
        // 4. save Ticket

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        ticket.setGate(gate);
        ticket.setOperator(null);
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(null);

        return ticketRepository.save(ticket);
    }

}
