package service;

import models.Vehicle;

import java.util.ArrayList;
import java.util.List;



public class OutputData {


//    int numberofvehicles = Integer.parse
//
//
//    Vehicle vehicle = new Vehicle();
//    int vehicle1 = vehicle.getVehicleId();
//    String vehicleIdString = String.valueOf(vehicle1);
//
//    int vehicle2 = vehicle.getNumOfRides();
//    String numOfRidesString = String.valueOf(vehicle2);
    public static String output(List<Vehicle> vehicles){
        
       String output = "";

        for(Vehicle vehicle: vehicles){
            output += vehicle.getNumOfRides();
            for (int ID:vehicle.getRideIds()
                    ) {
                output += " "+ID;
            }
        }
        return output;
    }









}
