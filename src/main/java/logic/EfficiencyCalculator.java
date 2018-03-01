package logic;

import javafx.util.Pair;
import models.Ride;
import models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class EfficiencyCalculator {

    public static List<Pair<Vehicle, Float>> CalculateDistanceBetweenRidesAndCars(Ride ride, List<Vehicle> cars){

        List<Pair<Vehicle, Float>> carsAndCoeficients = new ArrayList<>();
        Pair<Vehicle, Float> newCar;

        for (int i=0; i<cars.size(); i++){
            int distanceFromCarToStart = calculateDistanceBetweenPoints(cars.get(i).getLocation(), ride.getStartLocation());
            int lengthOfRide = calculateDistanceBetweenPoints(ride.getStartLocation(), ride.getEndLocation());
            int ttl = ride.getDeadLineTime() - ride.getEarlyStartTime();
            float coeficient = calculateCoeficientBetweenPoints(distanceFromCarToStart, lengthOfRide, ttl);
            newCar = new Pair<>(cars.get(i), coeficient);
            carsAndCoeficients.add(newCar);
        }
        return carsAndCoeficients;
    }

    private static int calculateDistanceBetweenPoints(Pair<Integer, Integer> point1, Pair<Integer, Integer> point2){
        return Math.abs(point1.getKey() - point2.getKey()) + Math.abs(point1.getValue() - point2.getValue());
    }

    private static float calculateCoeficientBetweenPoints(int distanceFromCarToStart, int totalDistance, int TTL){

        return (distanceFromCarToStart + totalDistance / TTL);
    }

}
