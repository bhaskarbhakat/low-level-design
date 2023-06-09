package com.ParkingLot.controllers;

import com.ParkingLot.dtos.CreateParkingLotRequestDto;
import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.services.ParkingLotService;

public class ParkingLotController {
    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService){
        this.parkingLotService = parkingLotService;
    }

    // 1. Create Parking Lot
    public ParkingLot createParkingLot(CreateParkingLotRequestDto request){
        return parkingLotService.createParkingLot(
            request.getId(),
            request.getNumberOfFloors(),
            request.getNumberOfSlotsPerFloor());
    }

    // 2. Update Parking Lot
    // 3. Read Parking Lot
    // 4. Delete Parking Lot
}
