package com.ParkingLot.controllers;

import com.ParkingLot.dtos.CreateParkingLotRequestDto;
import com.ParkingLot.model.Floor;
import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.model.VehicleType;
import com.ParkingLot.services.ParkingLotService;

public class ParkingLotController {
    private ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService){
        this.parkingLotService = parkingLotService;
    }

    // 1. Create Parking Lot
    public ParkingLot createParkingLot(CreateParkingLotRequestDto request){
        ParkingLot parkingLot = parkingLotService.createParkingLot(
            request.getId(),
            request.getNumberOfFloors(),
            request.getNumberOfSlotsPerFloor());
        System.out.println("Created parking lot with " + parkingLot.getNumberOfFloors() + " floors and " + parkingLot.getNumberOfSlotsPerFloor() + " slots per floor");
        return parkingLot;
    }


    // 2. Update Parking Lot
    // 3. Read Parking Lot
    // 4. Delete Parking Lot

    // 5. Display Parking Lot
    public void displayBoard(ParkingLot parkingLot, String displayType, String vehicleType){
        // System.out.println("No. of free slots for "+ vehicleType + " on Floor " + parkingFloor.getFloorNumber() +": ");

        for (Floor parkingFloor : parkingLot.getFloors()) {
            switch (vehicleType){
                case "CAR":
                    parkingLotService.displayFloorBoard(parkingFloor, displayType, VehicleType.CAR);
                    break;
                case "BIKE":
                    parkingLotService.displayFloorBoard(parkingFloor, displayType, VehicleType.BIKE);
                    break;
                case "TRUCK":
                    parkingLotService.displayFloorBoard(parkingFloor, displayType, VehicleType.TRUCK);
                    break;
            }
        }
    }
}
