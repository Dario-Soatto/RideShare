/**
 * Class for the Passenger object
 * Tracks the passenger's start, destination, and direction
 * @author Steven Li and Dario Soatto
 * @version 02/09/2023
 */

public class Passenger {
    private int pDest;
    private int pStart;
    private int pDir;

    /**
     * Constructor for the Passenger object
     * Sets start and destination to the inputted values
     * Sets the direction based on the start and destination
     * A direction of -2 is used if the passenger is already at its destination so that the direction differs from a car at its destination
     * @param myStart The location where the car starts
     * @param myDestination The destination for the car
     */

    public Passenger(int myStart, int myDestination) {
        pDest = myDestination;
        pStart = myStart;
        if(pDest > pStart) {
            pDir = 1;
        } else if(pDest < pStart) {
            pDir = -1;
        } else {
            pDir = -2;
        }
    }


    /**
     * Getter method for the destination
     * @return The passenger's destination
     */

    public int getDestination() {
        return pDest;
    }

    /**
     * Getter method for the direction
     * @return The passenger's direction
     */
    
    public int getDirection() {
        return pDir;
    }

    
    public String toString() {
        return super.toString() + " | Start: "  + pStart + " | Dest: " + pDest;
    }
}