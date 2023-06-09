package com.ParkingLot.repository;

import java.util.HashMap;
import java.util.Map;

import com.ParkingLot.model.ParkingLot;

public class ParkingLotRepository {

    private Map<String,ParkingLot> parkingLots = new HashMap<>();
    public ParkingLot save(ParkingLot parkingLot){
        parkingLots.put(parkingLot.getId(),parkingLot);
        return parkingLot;
    }

    public ParkingLot getParkingLotById(String id){
        return parkingLots.get(id);
    }

}
