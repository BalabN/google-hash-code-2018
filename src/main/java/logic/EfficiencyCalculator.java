package logic;

import javafx.util.Pair;
import models.Ride;
import models.Vehicle;

public class EfficiencyCalculator {

    public static float CalculateCoeficient(Vehicle vehicle, Ride ride){

        int distanceFromCarToStart = calculateDistanceBetweenPoints(vehicle.getLocation(), ride.getStartLocation());
        int lengthOfRide = calculateDistanceBetweenPoints(ride.getStartLocation(), ride.getEndLocation());
        int ttl = ride.getDeadLineTime() - ride.getEarlyStartTime();
        float coeficient = calculateCoeficientBetweenPoints(distanceFromCarToStart, lengthOfRide, ttl);

        return coeficient;
    }

    public static int calculateDistanceBetweenPoints(Pair<Integer, Integer> point1, Pair<Integer, Integer> point2){
        return Math.abs(point1.getKey() - point2.getKey()) + Math.abs(point1.getValue() - point2.getValue());
    }

    private static float calculateCoeficientBetweenPoints(int distanceFromCarToStart, int totalDistance, int TTL){

        return (distanceFromCarToStart + totalDistance / TTL);
    }

}
