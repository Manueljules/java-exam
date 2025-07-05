/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manuel.passengersource;

import java.util.Random;

/**
 *
 * @author USER
 */
public class PassengerSource {
    
    private final Company company;
    private final Random random;
    
    //constructor taking a company object//
    public PassengerSource(Company company){
        this.company = company;
        this.random = new Random();
    } 
    //request pickup method to create a passenger and schedule a vehicle//
    public boolean requestPickup(){
        
        
        //generate random pickup and destinations (x,y from 0 to 100)//
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));
        
        //create new passenger//
        Passenger passenger = new Passenger(pickup, destination);
        
        //schedule vehicle through the company and return result//
        return company.scheduleVehicle(passenger);
     }
   
} 

