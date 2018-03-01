package models;

import utlis.Pair;

public class Ride {
    Pair<Integer, Integer> rideStart;
    Pair<Integer, Integer> rideEnd;
    int earliestStart;
    int latestFinish;

    public Ride(Pair<Integer, Integer> rideStart, Pair<Integer, Integer> rideEnd, int earliestStart, int latestFinish) {
        this.rideStart = rideStart;
        this.rideEnd = rideEnd;
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
    }


}
