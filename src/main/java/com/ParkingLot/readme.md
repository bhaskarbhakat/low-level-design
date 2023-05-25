# Design a Parking Lot Management System

### Gather Requirements
```
1. Multiple floors
2. Each floor have multiple entry and exit gates
3. Each floor must have multiple slots
4. A slot can be of different size [EASY, MEDIUM, HARD]
5. An operator should be able to generate ticket at entry point of vehicle
6. Multiple vehicle type [BIKE, CYCLE, CAR]
7. Different slot allocation strategy
8. Parking fees will depend on duration and vehicle type
9. Operator must be able to generate bill at the exit point of vehicle
10. User should be able to pay through different payment modes, sytem should also support partial payment
```



---
### Class Diagram
```mermaid
classDiagram

    ParkingLot -- Address
    ParkingLot -- Floor

    class ParkingLot{
        - String parkingLotId
        - String parkingLotName
        - Address parkinglotAddress
        - List< Floor> floors
    }

    class Address{
        - String location
        - Integer zipCode
        - String Country
    }

    Floor -- Slot

    class Floor{
        - Integer floorNumber
        - List< Slot> slots
        - List< EntryGate> entryGates
        - List< ExitGate> exitGates
        - ParkingStrategy parkingStrategy
    }

    Slot -- SlotStatus
    Slot -- VehicleType

    class Slot{
        - Integer slotNumber
        - VehicleType vehicleType
        - SlotStatus slotStatus
    }

    class SlotStatus{
        <<enumeration>>
        IN_PROCESS
        EMPTY
        FILLED
    }

    class VehicleType{
        <<enumeration>>
        BIKE
        CAR
        TRUCK
    }

    Gate <|-- EntryGate
    Gate <|-- ExitGate

    class Gate{
        <<interface>>

    }

    EntryGate -- Ticket

    class EntryGate{
        - Ticket ticket
    }

    class ExitGate{
        - Bill bill
    }

    class Operator{
        
    }

    class Ticket{
        - Integer slotNumber
        - Date entryTime
    }

    class Bill{
        - String billId
        - Double amount
        - Payment payment
    }

    class Payment{
        
    }

    ParkingStrategy <|.. NearestSlotAssignmentStrategy

    class ParkingStrategy{
        <<interface>>
    }

    class NearestSlotAssignmentStrategy{
    }

```