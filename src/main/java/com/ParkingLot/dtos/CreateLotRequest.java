package com.ParkingLot.dtos;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateLotRequest {
    private long id;
    private String name;
    private String address;
    private int numberOfFloors;
    private int numberOfSlotsPerFloor;
    private int numberOfGates;
}
