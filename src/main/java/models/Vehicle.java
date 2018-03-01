package models;

import javafx.util.Pair;

import java.util.List;

public class Vehicle {
    private Pair<Integer, Integer> location;
    private int numOfRides;
    private List<Integer> rideIds;
    private int availableIn;

    public Vehicle(){}

    public Vehicle(Pair<Integer, Integer> location, int numOfRides, List<Integer> rideIds, int availableIn){
        this.location = location;
        this.numOfRides = numOfRides;
        this.rideIds = rideIds;
        this.availableIn = availableIn;
    }

    public Pair<Integer, Integer> getLocation() {
        return location;
    }

    public void setLocation(Pair<Integer, Integer> location) {
        this.location = location;
    }


    public int getNumOfRides() {
        return numOfRides;
    }

    public void setNumOfRides(int numOfRides) {
        this.numOfRides = numOfRides;
    }


    public List<Integer> getRideIds() {
        return rideIds;
    }

    public void setRideIds(List<Integer> rideIds) {
        this.rideIds = rideIds;
    }

    public int getAvailableIn() {
        return availableIn;
    }

    public void setAvailableIn(int availableIn) {
        this.availableIn = availableIn;
    }
}
