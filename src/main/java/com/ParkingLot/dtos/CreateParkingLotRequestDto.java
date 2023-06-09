package com.ParkingLot.dtos;

public class CreateParkingLotRequestDto {
    private String id;
    private Integer numberOfFloors;
    private Integer numberOfSlotsPerFloor;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }
    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public Integer getNumberOfSlotsPerFloor() {
        return numberOfSlotsPerFloor;
    }
    public void setNumberOfSlotsPerFloor(Integer numberOfSlotsPerFloor) {
        this.numberOfSlotsPerFloor = numberOfSlotsPerFloor;
    }

}
