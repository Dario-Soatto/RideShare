/**
 * File to test the RideShare project
 * Creates a new road, populates it, and moves the cars across
 * Prints the average revenue per car over the trials
 * @author Steven Li and Dario Soatto
 * @version 02/08/2023
 */
public class Tester {
    public static void main(String [] args) {
        int totalRev = 0;
        int totalMiles = 0;
        int numStations = 32;
        int numPassengers = 30;
        int numCars = 10;
        int numTrials = 1;
        System.out.println("Running the RideShare simulation!");
        for(int i = 0; i < numTrials; i++) {
            System.out.println("Establishing " + numStations + " stations...");
            Road r = new Road(numStations);
            System.out.println("Generating " + numPassengers + " passengers at random locations...");
            r.popPassengers(numPassengers);
            System.out.println("Generating " + numCars + " cars at random locations...");
            r.popCars(numCars);
            for(int j = 0; j < numStations; j++) {
                System.out.println("Station status on iteration " + j + " :");
                System.out.println(r);
                r.pickup();
                r.move();
            }
            totalRev += r.getRevenue();
            totalMiles += r.getMiles();
        }
        System.out.println("Average number of miles driven per car: " + (double) totalMiles / numTrials / numCars);
        System.out.println("Average revenue per car: " + (double) totalRev / numTrials / numCars);

        

    }
}