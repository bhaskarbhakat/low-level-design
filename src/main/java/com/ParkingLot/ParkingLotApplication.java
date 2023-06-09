package com.ParkingLot;

import java.util.Scanner;

import com.ParkingLot.controllers.ParkingLotController;
import com.ParkingLot.dtos.CreateParkingLotRequestDto;
import com.ParkingLot.model.ParkingLot;
import com.ParkingLot.repository.ParkingLotRepository;
import com.ParkingLot.services.ParkingLotService;

public class ParkingLotApplication {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        while(true){
            String input = sc.nextLine();
            String result[] = input.split(" ");
            ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
            ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
            ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);
            ParkingLot parkingLot;
            
            if (result[0].equals("create_parking_lot")) {
                String id = result[1];
                Integer numberOfFloors = Integer.parseInt(result[2]); 
                Integer numberOfSlotsPerFloor = Integer.parseInt(result[3]); 
                CreateParkingLotRequestDto request = new CreateParkingLotRequestDto();
                request.setId(id);
                request.setNumberOfFloors(numberOfFloors);
                request.setNumberOfSlotsPerFloor(numberOfSlotsPerFloor);
                parkingLot = parkingLotController.createParkingLot(request);
                System.out.println("Created parking lot with " + parkingLot.getNumberOfFloors() + " floors and " + parkingLot.getNumberOfSlotsPerFloor() + " slots per floor");
            }
            else if(result[0].equals("display") && result[1].equals("free_count")){
                if(result[2].equals("CAR")){
                    
                }
                else if(result[2].equals("BIKE")){

                }
                else if(result[2].equals("TRUCK")){

                }
            }
            else if(result[0].equals("display") && result[1].equals("free_slots")){
                
            }
            else if(result[0].equals("display") && result[1].equals("occupied_slots")){
                
            }
            else if(result[0].equals("unpark_vehicle")){

            }
            else if(result[0].equals("park_vehicle")){

            }
            else{
                break;
            }
        }

    }

}
