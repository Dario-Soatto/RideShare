/**
 * File to test the RideShare project
 * Creates a new road, populates it, and moves the cars across
 * Prints the average revenue per car over the trials
 * @author Steven Li and Dario Soatto
 * @version 02/08/2023
 */
public class Tester {
    public static void main(String [] args) {
        int total = 0;
        int numStations = 32;
        int numPassengers = 30;
        int numCars = 10;
        int numTrials = 10000;
        for(int i = 0; i < numTrials; i++) {
            Road r = new Road(numStations);
            r.popPassengers(numPassengers);
            r.popCars(numCars);
            for(int j = 0; j < numStations; j++) {
                r.pickup();
                r.move();
            }
            total += r.getRevenue();
            //System.out.println(r.getRevenue());
        }
        System.out.println(total/numTrials/numCars);
        

        //System.out.println(r);
    }
}