package com.ParkingLot.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {
    private String id;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Date entryTime;
    private Gate gate;
    private Operator operator;
}
