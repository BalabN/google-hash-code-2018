package models;

import utlis.Pair;

public class Car {
    Pair<Integer, Integer> currentPosition;
    int distanceToStart;
    int distanceToEnd;
    boolean isDriving;
    int hasPassenger;
    float k;

    public Car(Pair<Integer, Integer> currentPosition, int distanceToStart, int distanceToEnd, float k) {
        this.currentPosition = currentPosition;
        this.distanceToStart = distanceToStart;
        this.distanceToEnd = distanceToEnd;
        this.k = k;

    }
}
