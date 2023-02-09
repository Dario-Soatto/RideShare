/**
 * Class for the Station object
 * Contains ArrayLists of passengers and cars and methods to access and modify them
 * @author Steven Li and Dario Soatto
 * @version 02/09/2023
 */

import java.util.*;
public class Station {
    private ArrayList<Passenger> sPasList;
    private ArrayList<Car> sCarList;
    private int sNum;

    /**
     * Constructor for the Station 
     * Sets the station's number to the inputted number
     * Creates an ArrayList of passengers
     * Creates an ArrayList of cars
     * @param myNumber The number of the station
     */

    public Station(int myNumber) {
        sNum = myNumber;
        sPasList = new ArrayList<Passenger>();
        sCarList = new ArrayList<Car>();
    }

    /**
     * Method to add a passenger to the station
     * @param newP The passenger to add to the station
     */

    public void addPassenger(Passenger newP) {
        sPasList.add(newP);
    }

    /**
     * Method to add a car to the station
     * @param newC The car to add to the station
     */

    public void addCar(Car newC) {
        sCarList.add(newC);
    }
    
    /**
     * Method to remove a passenger from the station given the passenger
     * @param p The passenger to remove from the station
     */

    public void removePassenger(Passenger p) {
        sPasList.remove(p);
    }

    /**
     * Method to remove a passenger from the station given the index
     * @param i The index of the passenger to remove
     */

    public void removePassenger(int i) {
        sPasList.remove(i);
    }

    /**
     * Method to remove a car from the station given the car
     * @param c The car to remove from the station
     */

    public void removeCar(Car c) {
        sCarList.remove(c);
    }

    /**
     * Method to remove a car from the station given the indxe
     * @param i The index of the car to remove
     */

    public void removeCar(int i) {
        sCarList.remove(i);
    }

    /**
     * Getter method for the number of the station
     * @return The number of the station
     */

    public int getNumber() {
        return sNum;
    }

    /**
     * Getter method for a passenger
     * @param i The index of the passenger to return
     * @return The passenger at the index
     */

    public Passenger getPassenger(int i) {
        return sPasList.get(i);
    }

    /**
     * Getter method for all of the passengers
     * @return The ArrayList of passengers
     */

    public ArrayList<Passenger> getPassengers() {
        return sPasList;
    }

    /**
     * Getter method for the number of passengers
     * @return The number of passengers
     */

    public int getPasNum() {
        return sPasList.size();
    }

    /**
     * Getter method for a car
     * @param i The index of the car to return
     * @return The car at the index
     */

    public Car getCar(int i) {
        return sCarList.get(i);
    }

    /**
     * Getter method for all of the cars
     * @return The ArrayList of cars
     */

    public ArrayList<Car> getCars() {
        return sCarList;
    }

    /**
     * Getter method for the number of cars
     * @return The number of cars
     */
    
    public int getCarNum() {
        return sCarList.size();
    }

    public String toString() {
        return super.toString() + " | Number: " + sNum + " | Cars: " + sCarList + " | Passengers: " + sPasList;
    }



}