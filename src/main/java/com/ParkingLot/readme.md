# Design a Parking Lot Management System

### Gather Requirements
```

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