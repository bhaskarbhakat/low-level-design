package com.ParkingLot.strategies.spotAssignment;

import com.ParkingLot.model.Floor;
import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.model.ParkingSpot;
import com.ParkingLot.model.SpotStatus;
import com.ParkingLot.model.VehicleType;
import com.ParkingLot.utils.Mapping;

public class FindFirstAvailableStrategy implements SpotAssignmentStrategy{
    private Mapping util = new Mapping();

    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicleType) {
        for (Floor floor : parkingLot.getFloors()){
            for(ParkingSpot spot: floor.getParkingSpots()){
                if(spot.getSpotStatus().equals(SpotStatus.AVAILABLE) &&  util.getVehicleToSpotTypeMapping().get(vehicleType).equals(spot.getSpotType())){
                     return spot;
                }
            }
        }
        return null;
    }
    
}
