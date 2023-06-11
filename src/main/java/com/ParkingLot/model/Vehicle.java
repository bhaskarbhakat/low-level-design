package com.ParkingLot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vehicle {
    private VehicleType vehicleType;
    private String number;
    private String color;
}
