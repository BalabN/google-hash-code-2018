package service;

import javafx.util.Pair;
import models.Ride;
import models.Vehicle;
import models.World;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FillData {
    static String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
    public static World fillDataToDCfromFile(String fileName) throws IOException {
        World world = new World();
        String input = readFile("Items/" + fileName);

       // System.out.println(input);
        //ceu array vse ceu string
        String[] inputArray = input.split("\n");

        //Basic data
        //vyames prvo
        String[] params = inputArray[0].split(" ");

        //Klici world z columna pa rowi
        world.setColumn(Integer.parseInt(params[1]));
        world.setRow(Integer.parseInt(params[0]));
        world.setSteps(Integer.parseInt(params[5]));

        int numberOfRows = Integer.parseInt(params[0]);
        int numberOfColumns = Integer.parseInt(params[1]);
        int numberOfVehicle = Integer.parseInt(params[2]);
        int numberOfRides = Integer.parseInt(params[3]);
        int Bonus = Integer.parseInt(params[4]);
        int Steps = Integer.parseInt(params[5]);

        List<Ride> rides = new ArrayList<Ride>();
        // Za vsak ride gres cez ride
        for (int i = 1; i < numberOfRides + 1; i++) {
            String[] paramsi = inputArray[i].split(" ");
            //System.out.println("jump i: " + i + " = " + inputArray[i].toString());
            // iz [column,row]
            Ride ride = new Ride();
            ride.setRideId(i-1);
            ride.setStartLocation(new Pair<>(Integer.valueOf(paramsi[0]), Integer.valueOf(paramsi[1])));
            ride.setEndLocation(new Pair<>(Integer.valueOf(paramsi[0]), Integer.valueOf(paramsi[1])));
            ride.setEarlyStartTime(Integer.valueOf(paramsi[4]));
            ride.setDeadLineTime(Integer.valueOf(paramsi[5]));
            rides.add(ride);
        }
        world.setRide(rides);

        List<Vehicle> vehicles = new ArrayList<>();
        for (int i = 0; i < numberOfVehicle; i++){
            Vehicle veh = new Vehicle();
            veh.setVehicleId(i);
            veh.setLocation(new Pair<>(0,0));
            veh.setAvailableIn(0);
            veh.setNumOfRides(0);
            veh.setRideIds(new ArrayList<>());
            vehicles.add(veh);
        }
        world.setVehicle(vehicles);
        return world;
    }
}
