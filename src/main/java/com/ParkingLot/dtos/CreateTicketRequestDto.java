package com.ParkingLot.dtos;

import com.ParkingLot.model.Gate;
import com.ParkingLot.model.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTicketRequestDto {
    private Vehicle vehicle;
    private Gate gate;
}
