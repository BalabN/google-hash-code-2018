package models;

import javafx.util.Pair;


public class Ride {
    private int earlyStartTime;
    private int deadLineTime;
    private int rideId;
    private Pair<Integer, Integer> startLocation;
    private Pair<Integer, Integer> endLocation;

    public Ride(){}

    public Ride (int earlyStartTime, int deadLineTime,int rideId;, Pair<Integer, Integer> startLocation, Pair<Integer, Integer> endLocation){
        this.earlyStartTime = earlyStartTime;
        this.deadLineTime = deadLineTime;
        this.rideId = rideId;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public int getEarlyStartTime() {
        return earlyStartTime;
    }

    public void setEarlyStartTime(int earlyStartTime) {
        this.earlyStartTime = earlyStartTime;
    }

    public int getDeadLineTime() {
        return deadLineTime;
    }

    public void setDeadLineTime(int deadLineTime) {
        this.deadLineTime = deadLineTime;
    }

    public Pair<Integer, Integer> getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Pair<Integer, Integer> startLocation) {
        this.startLocation = startLocation;
    }

    public Pair<Integer, Integer> getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Pair<Integer, Integer> endLocation) {
        this.endLocation = endLocation;
    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }
}
