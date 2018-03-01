package models;

import utlis.Pair;

public class Ride {
    Pair<Integer, Integer> rideStart;
    Pair<Integer, Integer> rideEnd;
    int earliestStart;
    int latestFinish;

    public Ride(String line) {
        String[] content = line.split(" ");
        this.rideStart = new Pair<>(Integer.parseInt(content[0]), Integer.parseInt(content[1]));
        this.rideEnd = new Pair<>(Integer.parseInt(content[2]), Integer.parseInt(content[3]));
        this.earliestStart = Integer.parseInt(content[4]);
        this.latestFinish = Integer.parseInt(content[5]);
    }

    public Ride(int a, int b, int x, int y, int earliestStart, int latestFinish) {
        this.rideStart = new Pair<>(a, b);
        this.rideEnd = new Pair<>(x, y);
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
    }

    public Ride(Pair<Integer, Integer> rideStart, Pair<Integer, Integer> rideEnd, int earliestStart, int latestFinish) {
        this.rideStart = rideStart;
        this.rideEnd = rideEnd;
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "rideStart[0]=" + rideStart.getFirst() + "rideStart[1]=" + rideStart.getSecond() +
                ", rideEnd[0]=" + rideEnd.getFirst() + ", rideEnd[1]=" + rideEnd.getSecond() +
                ", earliestStart=" + earliestStart +
                ", latestFinish=" + latestFinish +
                '}';
    }
}
