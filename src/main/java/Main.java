import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;
import logic.EfficiencyCalculator;
import models.Ride;
import models.Vehicle;
import models.World;
import service.FillData;
import service.OutputData;

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


        for (Vehicle veh:world.getVehicle())
        {
            float minK = 10;
            int rideIdchosen = -1;
            for (Ride ride:world.getRide()
                 ) {
                float K = EfficiencyCalculator.CalculateCoeficient(veh, ride);
                if (K < minK){
                    minK = K;
                    rideIdchosen = ride.getRideId();
                }
            }

            veh.setNumOfRides(veh.getNumOfRides()+1);
            List<Integer> rideIDs = veh.getRideIds();
            rideIDs.add(rideIdchosen);
            veh.setRideIds(rideIDs);

            List<Ride> rides = world.getRide();
            for (Ride ride1:rides
                 ) {
                if (ride1.getRideId() == rideIdchosen){
                    rides.remove(ride1);
                }
            }
            world.setRide(rides);
        }

        System.out.println(OutputData.output(world.getVehicle()));

//        for (Vehicle veh:world.getVehicle()
//             ) {
//            System.out.println(veh.getNumOfRides() );
//            for (int ID:veh.getRideIds()
//                 ) {
//                System.out.println(" "+ID  );
//            }
//        }
        //// add to vehicle -> number of rides + 1 and id of ride
    }
}
