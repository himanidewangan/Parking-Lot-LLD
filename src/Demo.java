package src;

import src.vehicletype.Vehicle;
import src.vehicletype.*;
public class Demo {
    
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 100));
        parkingLot.addLevel(new Level(2,90));

        Vehicle car = new Car("BMW");
        Vehicle truck = new Truck("Mahindra");
        Vehicle motorcycle = new Motorcycle("Bullet");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        parkingLot.displayAvailability();

        parkingLot.unparkVehicle(truck);
        parkingLot.displayAvailability();

        
    }
}