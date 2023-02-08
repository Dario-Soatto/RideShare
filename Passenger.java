public class Passenger {
    private int pDest;
    private int pStart;
    private int pDir;

    /**
     * Constructor for the Passenger object
     * Sets start and destination to the inputted values
     * Sets the direction based on the start and destination
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