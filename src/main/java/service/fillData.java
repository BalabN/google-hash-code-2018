package service;

import models.Ride;
import models.World;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fillData {
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
    public static void fillDataToDCfromFile(String fileName) throws IOException {
        World world = new World();
        String input = readFile("Items/" + fileName);


//ceu array vse ceu string
        String[] inputArray = input.split("\n");

        //Basic data
        //vyames prvo
        String[] params = inputArray[0].split(" ");

        //Klici world z columna pa rowi
        world.setColumn(Integer.parseInt(params[0]));

        int numberOfRows = Integer.parseInt(params[0]);
        int numberOfColumns = Integer.parseInt(params[1]);
        int numberOfVehicle = Integer.parseInt(params[2]);
        int numberOfRides = Integer.parseInt(params[3]);
        int Bonus = Integer.parseInt(params[4]);
        int Steps = Integer.parseInt(params[5]);

        // Za vsak ride gres cez ride
        for (int i = 1; i < numberOfRides; i++) {
            // iz [column,row]
            Ride ride = new Ride();
            ride.set
            CacheServer cs = new CacheServer();
            cs.setIndex(i);
            cs.setMaxSize(capacityOfCaches);
            dc.addCs(cs);
        }

        int counterOfEndpoints = 0;
        int nextEndpointJump = 0;
        int counterOfRequests = 0;


    }
}
