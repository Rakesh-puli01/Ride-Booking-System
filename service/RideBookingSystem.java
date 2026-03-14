package service;

import model.Driver;
import model.User;
import model.Ride;
import graph.CityGraph;

import java.util.ArrayList;
import java.util.List;

public class RideBookingSystem {

    private List<Driver> drivers = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Ride> rides = new ArrayList<>();

    private CityGraph cityGraph = new CityGraph();
    private int rideCounter = 1;

    public void addDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Driver added successfully.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully.");
    }

    private Driver getAvailableDriver() {

        for (Driver d : drivers) {
            if (d.isAvailable()) {
                d.setAvailable(false);
                return d;
            }
        }

        return null;
    }

    public void bookRide(User user, String pickup, String drop) {

        Driver driver = getAvailableDriver();

        if (driver == null) {
            System.out.println("No drivers available!");
            return;
        }

        int distance = cityGraph.shortestPath(pickup, drop);

        Ride ride = new Ride(rideCounter++, user, driver, pickup, drop);
        rides.add(ride);

        ride.displayRide();

        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + (distance * 10));
    }

    public CityGraph getCityGraph() {
        return cityGraph;
    }
}