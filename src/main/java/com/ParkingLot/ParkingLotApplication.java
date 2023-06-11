package com.ParkingLot;

import java.util.Scanner;

import com.ParkingLot.controllers.ParkingLotController;
import com.ParkingLot.controllers.TicketController;
import com.ParkingLot.dtos.CreateParkingLotRequestDto;
import com.ParkingLot.dtos.CreateTicketRequestDto;
import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.model.Vehicle;
import com.ParkingLot.repository.ParkingLotRepository;
import com.ParkingLot.repository.TicketRepository;
import com.ParkingLot.services.ParkingLotService;
import com.ParkingLot.services.TicketService;
import com.ParkingLot.utils.Mapping;

public class ParkingLotApplication {
    
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        
        Mapping utils = new Mapping();
        String[] cmd = br.nextLine().split(" ");
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService); 
        CreateParkingLotRequestDto request = new CreateParkingLotRequestDto();

        request.setId(cmd[1]);
        request.setNumberOfFloors(Integer.parseInt(cmd[2]));
        request.setNumberOfSlotsPerFloor(Integer.parseInt(cmd[3]));

        ParkingLot parkingLot = parkingLotController.createParkingLot(request);

        TicketRepository ticketRepository = new TicketRepository(parkingLot);
        TicketService ticketService = new TicketService(ticketRepository);
        TicketController ticketController = new TicketController(ticketService);
        
        outerloop:
        while(true){
            String[] command = br.nextLine().split(" ");
            switch (command[0]){
                case "create_parking_lot":
                    break;
                case "park_vehicle":
                    Vehicle vehicle = new Vehicle(utils.getStringToVehicleTypeMapping().get(command[1]), command[2], command[3]);
                    CreateTicketRequestDto ticketRequestDto = new CreateTicketRequestDto();
                    ticketRequestDto.setGate(null);
                    ticketRequestDto.setVehicle(vehicle);

                    ticketController.createTicket(ticketRequestDto);
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
