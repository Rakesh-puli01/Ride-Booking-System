package model;

public class Ride {

    private int rideId;
    private User user;
    private Driver driver;
    private String pickupLocation;
    private String dropLocation;
    private RideStatus status;

    public Ride(int rideId, User user, Driver driver,
                String pickupLocation, String dropLocation) {

        this.rideId = rideId;
        this.user = user;
        this.driver = driver;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = RideStatus.REQUESTED;
    }

    public void startRide() {
        status = RideStatus.STARTED;
    }

    public void completeRide() {
        status = RideStatus.COMPLETED;
    }

    public void displayRide() {

        System.out.println("\nRide Details");
        System.out.println("Ride ID: " + rideId);
        System.out.println("User: " + user.getName());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Pickup: " + pickupLocation);
        System.out.println("Drop: " + dropLocation);
        System.out.println("Status: " + status);
    }
}