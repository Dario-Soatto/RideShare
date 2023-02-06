import java.util.*;
public class Car {
    private int cDest;
    private int cStart;
    private int cDir;
    private ArrayList<Passenger> cPasList;

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

    public int getDestination() {
        return cDest;
    }

    public int getDirection() {
        return cDir;
    }

    public void addPassenger(Passenger newP) {
        cPasList.add(newP);
    }
    

    public void removePassenger(Passenger p) {
        cPasList.remove(p);
    }

    public void removePassenger(int i) {
        cPasList.remove(i);
    }

    public Passenger getPassenger(int i) {
        return cPasList.get(i);
    }

    public ArrayList<Passenger> getPassengers() {
        return cPasList;
    }

    public String toString() {
        return super.toString() + " | Start: "  + cStart + " | Dest: " + cDest + " | Passengers: " + cPasList;
    }
}