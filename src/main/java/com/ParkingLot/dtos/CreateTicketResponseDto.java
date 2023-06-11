package com.ParkingLot.dtos;

import com.ParkingLot.model.Ticket;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTicketResponseDto {
    private Ticket ticket;
}
