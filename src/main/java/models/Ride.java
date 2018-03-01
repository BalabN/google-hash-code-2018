package models;

import javafx.util.Pair;


public class Ride {
    private int earlyStartTime;
    private int deadLineTime;
    private Pair<Integer, Integer> startLocation;
    private Pair<Integer, Integer> endLocation;
    private int id;

    public Ride(){}

    public Ride (int earlyStartTime, int deadLineTime, Pair<Integer, Integer> startLocation, Pair<Integer, Integer> endLocation, int id){
        this.earlyStartTime = earlyStartTime;
        this.deadLineTime = deadLineTime;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.id = id;
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

    public int getId() {return this.id; }
}
