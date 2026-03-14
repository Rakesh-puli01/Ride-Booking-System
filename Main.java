import service.RideBookingSystem;
import model.Driver;
import model.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        RideBookingSystem system = new RideBookingSystem();

        // Create City Map
        system.getCityGraph().addLocation("A");
        system.getCityGraph().addLocation("B");
        system.getCityGraph().addLocation("C");
        system.getCityGraph().addLocation("D");

        system.getCityGraph().addRoad("A","B",5);
        system.getCityGraph().addRoad("A","C",10);
        system.getCityGraph().addRoad("B","D",3);
        system.getCityGraph().addRoad("C","D",2);

        int choice;

        while(true) {

            System.out.println("\n===== Ride Booking System =====");
            System.out.println("1. Add Driver");
            System.out.println("2. Add User");
            System.out.println("3. Book Ride");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.println("\n--- Add Driver ---");

                    System.out.print("Enter Driver ID: ");
                    int did = sc.nextInt();

                    System.out.print("Enter Driver Name: ");
                    String dname = sc.next();

                    System.out.print("Enter Driver Location (A/B/C/D): ");
                    String dloc = sc.next();

                    system.addDriver(new Driver(did,dname,dloc));
                    break;

                case 2:

                    System.out.println("\n--- Add User ---");

                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();

                    System.out.print("Enter User Name: ");
                    String uname = sc.next();

                    system.addUser(new User(uid,uname));
                    break;

                case 3:

                    System.out.println("\n--- Book Ride ---");

                    System.out.print("Enter User Name: ");
                    String name = sc.next();

                    User user = new User(1,name);

                    System.out.print("Enter Pickup Location (A/B/C/D): ");
                    String pickup = sc.next();

                    System.out.print("Enter Drop Location (A/B/C/D): ");
                    String drop = sc.next();

                    system.bookRide(user,pickup,drop);
                    break;

                case 4:

                    System.out.println("Exiting system...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}