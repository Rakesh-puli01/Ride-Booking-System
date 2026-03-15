# Ride Booking System (Java)

## Project Description

The Ride Booking System is a console-based Java application that simulates the core functionality of a ride-hailing platform. The system allows users to request rides, assign drivers, and manage ride status through a simple interactive interface.

The project uses graph-based logic to represent locations and routes between cities. This helps simulate how ride services determine possible paths and manage ride requests between different locations.

This project demonstrates the practical use of Data Structures, Graph concepts, and Object-Oriented Programming to build a simplified backend system for ride booking and ride management.


## Features

- Create users and drivers
- Book rides between different locations
- Graph-based city route representation
- Assign drivers to ride requests
- Track ride status
- Manage ride information
- Console-based user interaction


## Technologies Used

- Java
- Data Structures (Graph, List, Map)
- Object-Oriented Programming
- Console-based input/output


## Project Structure

RideBookingSystem
│
├── graph
│   ├── CityGraph.java
│   └── Node.java
│
├── model
│   ├── Driver.java
│   ├── Ride.java
│   ├── RideStatus.java
│   └── User.java
│
├── service
│   └── RideBookingSystem.java
│
└── Main.java


## How to Run the Project

1. Clone the Repository

git clone https://github.com/your-username/ride-booking-system.git

2. Navigate to Project Folder

cd ride-booking-system

3. Compile the Java Files

javac Main.java graph/*.java model/*.java service/*.java

4. Run the Program

java Main


## Example Usage

Enter user name:
Alex

Enter pickup city:
City A

Enter destination city:
City B

Searching for available drivers...

Driver Assigned Successfully  
Ride Created


## Learning Outcomes

- Understanding ride booking system workflow
- Applying graph data structures to represent city routes
- Managing ride requests and driver assignment
- Practicing Object-Oriented Programming in Java
- Building structured console-based applications
