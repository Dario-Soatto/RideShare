import java.util.*;
public class Road{
    private Station[] stations;
    private int numStations;
    //private Car[] cars;

    public Road(int myNumStations){
        numStations = myNumStations;
        stations = new Station[numStations];
        for(int i = 0; i < numStations; i++) {
            stations[i] = new Station(i);
        }
        //cars = myCars;
    }

    public void popPassengers(int n) {
        for(int i = 0; i < n; i++) {
            int start = (int) (Math.random() * numStations);
            int destination = (int) (Math.random() * numStations);
            Passenger p1 = new Passenger(start, destination);
            (stations[start]).addPassenger(p1);
        }
    }

    public void popCars(int n) {
        for(int i = 0; i < n; i++) {
            int start = (int) (Math.random() * numStations);
            int destination = (int) (Math.random() * numStations);
            Car c1 = new Car(start, destination);
            (stations[start]).addCar(c1);
        }
    }

    public void popCarsTest() {
        Car c1 = new Car(4, 0);
        (stations[4]).addCar(c1);
        Car c2 = new Car(4, 1);
        (stations[4]).addCar(c2);
        Car c3 = new Car(4, 2);
        (stations[4]).addCar(c3);
        Car c4 = new Car(4, 3);
        (stations[4]).addCar(c4);
        
    }

    public void pickup() {
        for(int i = 0; i < stations.length; i++) {
            for(int j = 0; j < stations[i].getCarNum(); j++) {
                for(int k = 0; k < stations[i].getPasNum(); k++) {
                    if((stations[i].getCar(j)).getDirection() == (stations[i].getPassenger(k)).getDirection() && (stations[i].getCar(j)).getDestination() != i && (stations[i].getPassenger(k)).getDestination() != i) {
                        (stations[i].getCar(j)).addPassenger(stations[i].getPassenger(k));
                        stations[i].removePassenger(stations[i].getPassenger(k));
                    }
                }
            }
        }
    }

    public void move() {
        for(int i = 0; i < stations.length; i++) {
            for(int j = 0; j < stations[i].getCarNum(); j++) {
                if((stations[i].getCar(j)).getDirection() == -1 && (stations[i].getCar(j)).getDestination() != i) {
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
                    stations[i+1].addCar(stations[i].getCar(j));
                    stations[i].removeCar(stations[i].getCar(j));
                    dropoff(stations[i+1].getCar(stations[i+1].getCarNum()-1), i+1);
                    eject(stations[i+1].getCar(stations[i+1].getCarNum()-1), i+1);
                    j--;
                }
            }
        }
    }

    public void dropoff(Car c, int d) {
        for(int i = 0; i < (c.getPassengers()).size(); i++) {
            if((c.getPassenger(i)).getDestination() == d) {
                (stations[d].getPassengers()).add(c.getPassenger(i));
                c.removePassenger(i);
                i--;
            }
        }
    }

    public void eject(Car c, int d) {
        if(c.getDestination() == d) {
            for(int i = 0; i < (c.getPassengers()).size(); i++) {
                (stations[d].getPassengers()).add(c.getPassenger(i));
                c.removePassenger(i);
                i--;
            }
        }
    }

    public Station getStation(int loc) {
        return stations[loc];
    }

    public Station[] getStations() {
        return stations;
    }

    public String toString() {
        String r = "";
        for(int i = 0; i < stations.length; i++) {
            r += stations[i] + "\n";
        }
        return super.toString() + r;
    }
}