package com.BookMyShow.models;

import java.util.List;

import javax.xml.crypto.Data;

public class Ticket {
    private Show show;
    private List<ShowSeat> showSeats;
    private List<Payment> payments;
    private TicketStatus ticketStatus;
    private Data bookingTime;
    private double amount;
}
