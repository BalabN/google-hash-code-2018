package models;


import java.util.List;

public class World {
    private int row;
    private int column;
    private int numvihicles;
    private int numrides;
    private int bonus;
    private int steps;
    private List<Vehicle> vehicle;
    private List<Ride> ride ;

    public World(){}

    public World(int row, int column, int numvihicles, int numrides, int bonus , int steps,List<Vehicle> vehicle,List<Ride> ride ){
        this.row = row;
        this.column = column;
        this.numvihicles = numvihicles;
        this.numrides = numrides;
        this.bonus = bonus;
        this.steps = steps;
        this.vehicle = vehicle;
        this.ride = ride;

    }

    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public int getNumvihicles() {
        return numvihicles;
    }
    public void setNumvihicles(int numvihicles) {
        this.numvihicles = numvihicles;
    }
    public int getNumrides() {
        return numrides;
    }
    public void setNumrides(int numrides) {
        this.numrides = numrides;
    }
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public int getSteps() {
        return steps;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }


    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public List<Vehicle> getVehicle() {
        return this.vehicle;
    }
    public void setRide(List<Ride> ride) {
        this.ride = ride;
    }

    public List<Ride> getRide() {
        return this.ride;
    }


}

