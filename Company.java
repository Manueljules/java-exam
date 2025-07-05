/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manuel.passengersource;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.List;
public class Company {
    private final List<Vehicle> vehicles;

    // Constructor
    public Company() {
        vehicles = new ArrayList<>();
        // Initialize a small fleet (e.g., 3 vehicles) for demonstration
        vehicles.add(new Vehicle(4)); // Taxi: 4 seats
        vehicles.add(new Vehicle(4)); // Taxi: 4 seats
        vehicles.add(new Vehicle(10)); // Shuttle: 10 seats
    }
    
    // Schedule a vehicle for a passenger
    public boolean scheduleVehicle(Passenger passenger) {
        // Find an available vehicle with sufficient seats
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailable() && vehicle.getCapacity() >= passenger.getSeatsRequired()) {
                vehicle.setAvailable(false); // Mark vehicle as unavailable
                return true; // Successfully scheduled
            }
        }
        return false; // No suitable vehicle available
    }
    // Inner Vehicle class for simplicity
    private class Vehicle {
        private final int capacity;
        private boolean available;

        public Vehicle(int capacity) {
            this.capacity = capacity;
            this.available = true; // Initially available
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }
        
       public int getCapacity() {
            return capacity;
        }
    } 
}
