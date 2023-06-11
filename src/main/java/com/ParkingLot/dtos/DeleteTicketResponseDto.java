package com.ParkingLot.dtos;

import com.ParkingLot.model.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteTicketResponseDto {
    private Vehicle vehicle;
}
