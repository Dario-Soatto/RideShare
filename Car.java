/**
 * Class for the Car object
 * Contains an ArrayList of passengers and associated methods
 * @author Steven Li and Dario Soatto
 * @version 02/08/2023
 */
import java.util.*;
public class Car {
    
    
    private int cDest;
    private int cStart;
    private int cDir;
    private ArrayList<Passenger> cPasList;

    
    /**
     * Constructor for the Car object
     * Sets start and destination to the inputted values
     * Sets the direction based on the start and destination
     * Creates an empty ArrayList of Passengers
     * @param myStart The location where the car starts
     * @param myDestination The destination for the car
     */
    public Car(int myStart, int myDestination) {
        cStart = myStart;
        cDest = myDestination;
        if(cDest > cStart) {
            cDir = 1;
        } else if(cDest < cStart) {
            cDir = -1;
        } else {
            cDir = 2;
        }
        cPasList = new ArrayList<Passenger>();
    }

    /**
     * Getter method for the destination
     * @return The car's destination
     */
    public int getDestination() {
        return cDest;
    }

    /**
     * Getter method for the direction
     * @return The car's direction
     */
    public int getDirection() {
        return cDir;
    }

    /**
     * Getter method for the number of passengers in the car
     * @return The number of passengers in the car
     */
    public int getPasNum() {
        return cPasList.size();
    }

/**
 * Method for adding a passenger to the car
 * @param newP The passenger to add to the car
 */
    public void addPassenger(Passenger newP) {
        cPasList.add(newP);
    }
    
    /**
     * Method for removing a passenger from the car
     * @param p The passenger to remove from the car
     */
    public void removePassenger(Passenger p) {
        cPasList.remove(p);
    }

    /**
     * Method for removing a passenger from the car
     * @param i The index of the passenger to be removed
     */
    public void removePassenger(int i) {
        cPasList.remove(i);
    }

    /**
     * Getter method for a passenger in the car
     * @param i The index of the passenger to be returned
     * @return The passenger at the index
     */
    public Passenger getPassenger(int i) {
        return cPasList.get(i);
    }

    /**
     * Getter method for the ArrayList of passengers in the car
     * @return ArrayList of passengers in the car
     */
    public ArrayList<Passenger> getPassengers() {
        return cPasList;
    }

    public String toString() {
        return super.toString() + " | Start: "  + cStart + " | Dest: " + cDest + " | Passengers: " + cPasList;
    }
}