package com.ParkingLot.model;

import java.util.List;

public class ParkingLot {
    private String name;
    private String address;
    private List<EntryGate> entryGates;
    private List<ExitGate> exitGates;
    private List<Floor> floors;
    private Integer numberOfFloors;
    private Integer numberOfSlotsPerFloor;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<EntryGate> getEntryGates() {
        return entryGates;
    }
    public void setEntryGates(List<EntryGate> entryGates) {
        this.entryGates = entryGates;
    }
    public List<ExitGate> getExitGates() {
        return exitGates;
    }
    public void setExitGates(List<ExitGate> exitGates) {
        this.exitGates = exitGates;
    }
    public List<Floor> getFloors() {
        return floors;
    }
    public void setFloors(List<Floor> floors) {
        this.floors = floors;
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
