package com.ParkingLot.services;

import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.repository.ParkingLotRepository;

public class ParkingLotService {
    
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot createParkingLot(String id, Integer numberOfFloors, Integer numberOfSlotsPerFloor){
        // private String name;
        // private String address;
        // private List<EntryGate> entryGates;
        // private List<ExitGate> exitGates;
        // private List<Floor> floors;
        // private Integer numberOfFloors;
        // private Integer numberOfSlotsPerFloor;
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress("Bangalore Koramangla");
        parkingLot.setId(id);
        parkingLot.setNumberOfFloors(numberOfFloors);
        parkingLot.setNumberOfSlotsPerFloor(numberOfSlotsPerFloor);
        parkingLot.setEntryGates(null);
        parkingLot.setExitGates(null);
        parkingLot.setFloors(null);
        System.out.println("Created parking lot with " + parkingLot.getNumberOfFloors() + " floors and " + parkingLot.getNumberOfFloors() + " slots per floor");
        return parkingLotRepository.save(parkingLot);
    }
    
}
