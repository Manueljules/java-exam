/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package manuel.passengersource;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        PassengerSource source = new PassengerSource(company);

        // Simulate multiple pickup requests
        for (int i = 0; i < 5; i++) {
            boolean scheduled = source.requestPickup();
            System.out.println("Request " + (i + 1) + " scheduled: " + scheduled);
        }
    }
}
 

