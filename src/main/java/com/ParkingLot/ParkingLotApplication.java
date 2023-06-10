package com.ParkingLot;

import java.util.Scanner;

import com.ParkingLot.controllers.ParkingLotController;
import com.ParkingLot.dtos.CreateParkingLotRequestDto;
import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.repository.ParkingLotRepository;
import com.ParkingLot.services.ParkingLotService;

public class ParkingLotApplication {
    
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        String[] cmd = br.nextLine().split(" ");
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService); 
        CreateParkingLotRequestDto request = new CreateParkingLotRequestDto();
        request.setId(cmd[1]);
        request.setNumberOfFloors(Integer.parseInt(cmd[2]));
        request.setNumberOfSlotsPerFloor(Integer.parseInt(cmd[3]));

        ParkingLot parkingLot = parkingLotController.createParkingLot(request);

        outerloop:
        while(true){
            String[] command = br.nextLine().split(" ");
            switch (command[0]){
                case "create_parking_lot":
                    break;
                case "park_vehicle":
                    break;
                case "unpark_vehicle":
                    break;
                case "display":
                    parkingLotController.displayBoard(parkingLot, command[1], command[2]);
                    break;
                case "exit":
                    break outerloop;
            }
        }

    }

}
