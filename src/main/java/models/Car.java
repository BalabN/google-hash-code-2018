package models;

import java.util.ArrayList;
import java.util.List;

import utlis.MathUtils;
import utlis.Pair;

public class Car {
    private Pair<Integer, Integer> currentPosition;
    private int currentSteps = -1;
    private List<Ride> rides = new ArrayList<>();
    private int distanceToStart;
    private int distanceToEnd;
    private int currentRideIndex;
    private boolean isDriving;
    private int hasPassenger;
    float k;

    public Car(Pair<Integer, Integer> currentPosition, int distanceToStart, int distanceToEnd, float k) {
        this.currentPosition = currentPosition;
        this.distanceToStart = distanceToStart;
        this.distanceToEnd = distanceToEnd;
        this.k = k;

    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public void calculateKoeficient(Ride ride, int worldStep) {



//        k = cc;
    }

    public void nextStep() {


        updateCurrentPosition();
        if (currentSteps > -1) {
            currentSteps--;
        }
    }

    private void updateCurrentPosition() {
        
    }
}
