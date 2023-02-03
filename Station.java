import java.util.*;
public class Station {
    private ArrayList<Passenger> pasList;
    private int number;

    public Station(int myNumber) {
        number = myNumber;
        pasList = new ArrayList<Passenger>();
    }

    public void addPassenger(Passenger newP) {
        pasList.add(newP);
    }

    public void removePassenger(Passenger p) {
        pasList. remove(p);
    }

    

}