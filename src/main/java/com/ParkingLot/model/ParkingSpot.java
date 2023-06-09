package com.ParkingLot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ParkingSpot {
    private int spotNumber;
    private int floorNumber;
    private SpotStatus spotStatus;
    private SpotType spotType;
}
