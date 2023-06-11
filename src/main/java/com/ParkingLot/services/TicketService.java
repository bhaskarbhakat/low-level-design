package com.ParkingLot.services;

import java.util.Date;

import com.ParkingLot.model.Gate;
import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.model.ParkingSpot;
import com.ParkingLot.model.SpotStatus;
import com.ParkingLot.model.Ticket;
import com.ParkingLot.model.Vehicle;
import com.ParkingLot.repository.TicketRepository;
import com.ParkingLot.strategies.spotAssignment.SpotAssignmentStrategy;

public class TicketService {
    private TicketRepository ticketRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLot parkingLot;

    public TicketService(TicketRepository ticketRepository, SpotAssignmentStrategy spotAssignmentStrategy, ParkingLot parkingLot){
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.ticketRepository = ticketRepository;
        this.parkingLot = parkingLot;
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

        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(parkingLot, vehicle.getVehicleType());
        if(parkingSpot == null) return null;
        ticket.setParkingSpot(parkingSpot);
        parkingSpot.setSpotStatus(SpotStatus.OCCUPIED);

        return ticketRepository.save(ticket);
    }

    public Ticket deleteTicket(String ticketId){
        Ticket ticket = ticketRepository.getTicketById(ticketId);
        if(ticket == null)  return null;
        ticket.getParkingSpot().setSpotStatus(SpotStatus.AVAILABLE);
        ticketRepository.delete(ticketId);
        return ticket;
    }
}
