package com.ParkingLot.repository;

import java.util.HashMap;
import java.util.Map;

import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.model.Ticket;

public class TicketRepository {
    
    private ParkingLot parkingLot;

    public TicketRepository(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    private Map<String, Ticket> tickets = new HashMap<>();
    public Ticket save(Ticket ticket){
        String str1 =  parkingLot.getId();;
        String str2 = Integer.toString(4);
        String str3 = Integer.toString(5); 

        ticket.setId(str1.concat("_").concat(str2).concat("_").concat(str3));
        tickets.put(ticket.getId(), ticket);
        System.out.println(ticket.getId());
        return ticket;
    }

    public Ticket getTicketById(String id){
        return tickets.get(id);
    }

}
