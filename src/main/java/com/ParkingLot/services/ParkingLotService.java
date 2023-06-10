package com.ParkingLot.services;

import java.util.LinkedList;
import java.util.List;
import com.ParkingLot.utils.Mapping;
import com.ParkingLot.model.EntryGate;
import com.ParkingLot.model.ExitGate;
import com.ParkingLot.model.Floor;
import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.model.ParkingSpot;
import com.ParkingLot.model.SpotStatus;
import com.ParkingLot.model.SpotType;
import com.ParkingLot.model.VehicleType;
import com.ParkingLot.repository.ParkingLotRepository;

public class ParkingLotService {
    
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot createParkingLot(String id, Integer numberOfFloors, Integer numberOfSlotsPerFloor){

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress("Bangalore Koramangla");
        parkingLot.setId(id);
        parkingLot.setNumberOfFloors(numberOfFloors);
        parkingLot.setNumberOfSlotsPerFloor(numberOfSlotsPerFloor);

        List<Floor> floors = new LinkedList<>();
        List<EntryGate> entryGates = new LinkedList<>();
        List<ExitGate> exitGates = new LinkedList<>();

        for(int i=0;i<numberOfFloors;i++){
            List<ParkingSpot> spots = new LinkedList<>();
            
            for(int j=0;j<numberOfSlotsPerFloor;j++){
                ParkingSpot newSpot;
                if(j == 0){
                    newSpot = new ParkingSpot(j+1, i+1, SpotStatus.AVAILABLE, SpotType.LARGE);
                }
                else if(j==1||j==2){
                    newSpot = new ParkingSpot(j+1, i+1, SpotStatus.AVAILABLE, SpotType.SMALL);
                }
                else{
                    newSpot = new ParkingSpot(j+1, i+1, SpotStatus.AVAILABLE, SpotType.MEDIUM);
                }
                spots.add(newSpot);
            }
            Floor newFloor = new Floor(i+1,spots);
            floors.add(newFloor);
        }

        parkingLot.setEntryGates(null);
        parkingLot.setExitGates(null);
        parkingLot.setFloors(floors);
        return parkingLotRepository.save(parkingLot);
    }
    
    public void displayFloorBoard(Floor parkingFloor, String displayType, VehicleType vehicleType){

        switch (displayType){
            case "free_count":
                int count=0;
                Mapping util = new Mapping();
                for (ParkingSpot spot: parkingFloor.getParkingSpots()){
                    if(spot.getSpotStatus() == SpotStatus.AVAILABLE&& (spot.getSpotType() == (util.getVehicleToSpotTypeMapping().get(vehicleType))))    count++;
                }
                System.out.println("No. of free slots for " + vehicleType.toString() + " on Floor "+ parkingFloor.getFloorNumber() +": "+ count);
                break;
        }
    }
    

}
