import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
            world = FillData.fillDataToDCfromFile("b_should_be_easy.in");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // push data to Computin EffieciencyCalculator(Ride, List<Vehicle>) -- Available Rides and vehicle
        // evaluate rides and k forall -> the smalles K is a pair -> ride - veh

        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle veh : world.getVehicle()
                ) {
            // System.out.println("veh: " + veh.getAvailableIn());
            if (veh.getAvailableIn() == 0) {
                availableVehicles.add(veh);
            }
        }
        System.out.println("world.getSteps(): " + world.getSteps());
        for (int f = 0; f < world.getSteps(); f++) {
            availableVehicles = new ArrayList<>();
            for (Vehicle veh : world.getVehicle()
                    ) {
                // System.out.println("veh: " + veh.getAvailableIn());
                if (veh.getAvailableIn() == 0) {
                    availableVehicles.add(veh);
                } else if (veh.getAvailableIn() > 0) {
                    veh.setAvailableIn(veh.getAvailableIn() - 1);
                }
            }

            for (Vehicle veh : world.getVehicle()) {
                float minK = Integer.MAX_VALUE;
                int rideIdchosen = -1;
                for (Ride ride : world.getRide()
                        ) {
                    float K = EfficiencyCalculator.CalculateCoeficient(veh, ride);
                    if (K < minK) {
                        minK = K;
                        rideIdchosen = ride.getRideId();
                    }
                }
                // System.out.println("minK: " + minK);
                //  System.out.println("rideIdchosen: " + rideIdchosen);

                if (rideIdchosen != -1) {
                    veh.setAvailableIn(EfficiencyCalculator.calculateDistanceBetweenPoints(veh.getLocation(), world.getRide().get(rideIdchosen).getStartLocation()) + EfficiencyCalculator.calculateDistanceBetweenPoints(world.getRide().get(rideIdchosen).getStartLocation(), world.getRide().get(rideIdchosen).getEndLocation()));
                    veh.setNumOfRides(veh.getNumOfRides() + 1);
                    List<Integer> rideIDs = veh.getRideIds();
                    rideIDs.add(rideIdchosen);
                    veh.setRideIds(rideIDs);

                    for (ListIterator<Ride> iter = world.getRide().listIterator(); iter.hasNext(); ) {
                        Ride a = iter.next();
                        if (a.getRideId() == rideIdchosen) {
                            iter.remove();
                        }
                    }
                }
            }
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
