import java.util.*;
public class Road{
    private Station[] stations;
    private int numStations;
    private int revenue;
    //private Car[] cars;

    /**
     * Constructor for the Road object
     * Sets the number of stations equal to the inputted value
     * Populates an array with a number of stations equal to the inputted values
     * @param myNumStations
     */
    public Road(int myNumStations){
        numStations = myNumStations;
        stations = new Station[numStations];
        for(int i = 0; i < numStations; i++) {
            stations[i] = new Station(i);
        }
        //cars = myCars;
    }

    /**
     * Method to fill the road with passengers
     * For a number of passengers according to the inputted value:
     * Sets a random start and destination
     * Adds the passenger to the starting station
     * @param n The number of passengers
     */
    public void popPassengers(int n) {
        for(int i = 0; i < n; i++) {
            int start = (int) (Math.random() * numStations);
            int destination = (int) (Math.random() * numStations);
            Passenger p1 = new Passenger(start, destination);
            (stations[start]).addPassenger(p1);
        }
    }

    /**
     * Method to fill the road with cars
     * For a number of cars according to the inputted value:
     * Sets a random start and destination
     * Adds the cars to the starting station
     * @param n The number of cars
     */
    public void popCars(int n) {
        for(int i = 0; i < n; i++) {
            int start = (int) (Math.random() * numStations);
            int destination = (int) (Math.random() * numStations);
            Car c1 = new Car(start, destination);
            (stations[start]).addCar(c1);
        }
    }

    /**
     * Method for cars to pick up passengers
     * Iterates through each of the stations
     * For each station, iterates through each car
     * While at each car, iterates through each passenger
     * The passenger is added to the car and removed from the station if:
     * The car and passenger have the same direction, neither is at its destination, and the car has fewer than three passengers
     */
    public void pickup() {
        for(int i = 0; i < stations.length; i++) {
            for(int j = 0; j < stations[i].getCarNum(); j++) {
                for(int k = 0; k < stations[i].getPasNum(); k++) {
                    if((stations[i].getCar(j)).getDirection() == (stations[i].getPassenger(k)).getDirection() && (stations[i].getCar(j)).getDestination() != i && (stations[i].getPassenger(k)).getDestination() != i && (stations[i].getCar(j)).getPasNum() < 3) {
                        (stations[i].getCar(j)).addPassenger(stations[i].getPassenger(k));
                        stations[i].removePassenger(stations[i].getPassenger(k));
                    }
                }
            }
        }
    }

    /**
     * Method for the cars to move to the next station
     * Two different for loops iterate through the stations to ensure that a car moves only one station
     * For the loop that starts from the beginning, cars are moved in the negative direction
     * For the loop that starts from the end, cars are moved in the positive direction
     * For each station, a loop iterates through each car
     * If the direction of the car is correct and the car isn't at its destination:
     * Revenue is increased by the number of passengers in the car
     * The car is added to the next station
     * The car is removed from the previous station
     * The dropoff and eject functions are called
     * The counter for the cars is deincremented to avoid skipping
     */
    public void move() {
        for(int i = 0; i < stations.length; i++) {
            for(int j = 0; j < stations[i].getCarNum(); j++) {
                if((stations[i].getCar(j)).getDirection() == -1 && (stations[i].getCar(j)).getDestination() != i) {
                    revenue += stations[i].getCar(j).getPasNum();
                    //System.out.println(stations[i].getCar(j).getPasNum());
                    stations[i-1].addCar(stations[i].getCar(j));
                    stations[i].removeCar(stations[i].getCar(j));
                    dropoff(stations[i-1].getCar(stations[i-1].getCarNum()-1), i-1);
                    eject(stations[i-1].getCar(stations[i-1].getCarNum()-1), i-1);
                    j--;
                }
            }
        }
        for(int i = stations.length-1; i >= 0; i--) {
            for(int j = 0; j < stations[i].getCarNum(); j++) {
                if((stations[i].getCar(j)).getDirection() == 1 && (stations[i].getCar(j)).getDestination() != i) {
                    revenue += stations[i].getCar(j).getPasNum();
                    //System.out.println(stations[i].getCar(j).getPasNum());
                    stations[i+1].addCar(stations[i].getCar(j));
                    stations[i].removeCar(stations[i].getCar(j));
                    dropoff(stations[i+1].getCar(stations[i+1].getCarNum()-1), i+1);
                    eject(stations[i+1].getCar(stations[i+1].getCarNum()-1), i+1);
                    j--;
                }
            }
        }
    }

    /**
     * Method for cars to drop off passengers that have reached their destination
     * For loop iterates through each passenger in the car
     * If the passenger is at its destination:
     * The passenger is added to the station
     * The passenger is removed from the car
     * The counter is deincremented to avoid skipping
     * @param c The car with passengers
     * @param d The location of the car
     */
    public void dropoff(Car c, int d) {
        for(int i = 0; i < (c.getPassengers()).size(); i++) {
            if((c.getPassenger(i)).getDestination() == d) {
                (stations[d].getPassengers()).add(c.getPassenger(i));
                c.removePassenger(i);
                i--;
            }
        }
    }

    /**
     * Method for cars to remove all passengers if the car has reached its destination
     * If the car has reached its destination, a for loop iterates through the passengers in the car
     * The passengers are added to the station
     * The passengers are removed from the car
     * The counter is deincremented to avoid skipping
     * @param c
     * @param d
     */
    public void eject(Car c, int d) {
        if(c.getDestination() == d) {
            for(int i = 0; i < (c.getPassengers()).size(); i++) {
                (stations[d].getPassengers()).add(c.getPassenger(i));
                c.removePassenger(i);
                i--;
            }
        }
    }

    /**
     * Getter method for a station at a certain location
     * @param loc The index of the station
     * @return The station at the location
     */
    public Station getStation(int loc) {
        return stations[loc];
    }

    /**
     * Getter method for all of the stations
     * @return The aray of stations
     */
    public Station[] getStations() {
        return stations;
    }

    /**
     * Getter method for the revenue
     * @return The total revenue
     */
    public int getRevenue() {
        return revenue;
    }

    public String toString() {
        String r = "";
        for(int i = 0; i < stations.length; i++) {
            r += stations[i] + "\n";
        }
        return super.toString() + r;
    }
}