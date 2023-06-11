package com.ParkingLot.utils;

import java.util.HashMap;

import com.ParkingLot.model.SpotType;
import com.ParkingLot.model.VehicleType;

public class Mapping {
        HashMap<VehicleType, SpotType> vehicleToSpotTypeMapping = new HashMap<VehicleType, SpotType>();
        HashMap<String, VehicleType> stringToVehicleTypeMapping = new HashMap<String, VehicleType>();
        public HashMap<VehicleType, SpotType> getVehicleToSpotTypeMapping() {
            vehicleToSpotTypeMapping.put(VehicleType.BIKE,SpotType.SMALL);
            vehicleToSpotTypeMapping.put(VehicleType.CAR,SpotType.MEDIUM);
            vehicleToSpotTypeMapping.put(VehicleType.TRUCK,SpotType.LARGE);
            return vehicleToSpotTypeMapping;
        }

        public HashMap<String, VehicleType> getStringToVehicleTypeMapping() {
            stringToVehicleTypeMapping.put("CAR", VehicleType.CAR);
            stringToVehicleTypeMapping.put("BIKE", VehicleType.BIKE);
            stringToVehicleTypeMapping.put("TRUCK", VehicleType.TRUCK);
            return stringToVehicleTypeMapping;
        }
}
