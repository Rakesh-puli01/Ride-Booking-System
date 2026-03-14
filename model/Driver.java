package model;

public class Driver {

    private int driverId;
    private String name;
    private String location;
    private boolean available;

    public Driver(int driverId, String name, String location) {
        this.driverId = driverId;
        this.name = name;
        this.location = location;
        this.available = true;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        this.available = status;
    }

    @Override
    public String toString() {
        return "Driver ID: " + driverId +
                ", Name: " + name +
                ", Location: " + location +
                ", Available: " + available;
    }
}