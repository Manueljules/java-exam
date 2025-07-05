/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manuel.passengersource;

/**
 *
 * @author USER
 */
public class Passenger {
    private final Location pickup;
    private final Location destination;
    private final int seatsRequired;

    // Constructor
    public Passenger(Location pickup, Location destination) {
        this.pickup = pickup;
        this.destination = destination;
        this.seatsRequired = 1; // Default to 1 seat for simplicity
    }

    // Getters
    public Location getPickup() {
        return pickup;
    }

    public Location getDestination() {
        return destination;
    }

    int getSeatsRequired() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
