package com.BookMyShow.models;

import java.sql.Date;
import java.util.List;

public class Ticket {
    private Show show;
    private List<ShowSeat> showSeats;
    private List<Payment> payments;
    private TicketStatus ticketStatus;
    private Date bookingTime;
    private double amount;
}
