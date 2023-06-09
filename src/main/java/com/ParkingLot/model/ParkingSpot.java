package com.ParkingLot.model;

public class ParkingSpot {
    private int spotNumber;
    private Floor parkingFloor;
    private SpotStatus spotStatus;
    private SpotType spotType;

    public int getSpotNumber() {
        return spotNumber;
    }
    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }
    public Floor getParkingFloor() {
        return parkingFloor;
    }
    public void setParkingFloor(Floor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
    public SpotStatus getSpotStatus() {
        return spotStatus;
    }
    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }
    public SpotType getSpotType() {
        return spotType;
    }
    public void setSpotType(SpotType spotType) {
        this.spotType = spotType;
    } 
}
