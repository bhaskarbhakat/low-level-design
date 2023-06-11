package com.ParkingLot.strategies.spotAssignment;

import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.model.ParkingSpot;
import com.ParkingLot.model.VehicleType;

public interface SpotAssignmentStrategy {

    ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicleType);
}
