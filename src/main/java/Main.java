import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;
import models.Ride;
import models.Vehicle;
import models.World;
import service.FillData;

public class Main {

    public static void main(String[] args) {

        //Get data from file
        FillData fillData = new FillData();
        World world = null;
        try {
            world = FillData.fillDataToDCfromFile("a_example.in");
        } catch (IOException e) {
            e.printStackTrace();
        }



        // push data to Computin EffieciencyCalculator(Ride, List<Vehicle>) -- Available Rides and vehicle
        // evaluate rides and k forall -> the smalles K is a pair -> ride - veh

        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle veh:world.getVehicle()
             ) {
            System.out.println("veh: " + veh.getAvailableIn());
            if (veh.getAvailableIn() == 0){
                availableVehicles.add(veh);
            }
        }

        List<Pair<Integer, Pair<Integer,Float>>> K = new ArrayList<>();
        for (Ride ride:world.getRide())
        {
           // List<Pair<Vehicle, Float>> KforRide = CalculateDistanceBetweenRidesAndCars(ride.getID(), availableVehicles);
//            for (Vehicle veh: world.getVehicle())
//            {
//
//            }
//            K.add()
       }

        //// add to vehicle -> number of rides + 1 and id of ride
    }
}
