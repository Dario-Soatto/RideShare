import java.util.*;
public class Station {
    private ArrayList<Passenger> sPasList;
    private ArrayList<Car> sCarList;
    private int sNum;

    public Station(int myNumber) {
        sNum = myNumber;
        sPasList = new ArrayList<Passenger>();
        sCarList = new ArrayList<Car>();
    }

    public void addPassenger(Passenger newP) {
        sPasList.add(newP);
    }

    public void addCar(Car newC) {
        sCarList.add(newC);
    }
    

    public void removePassenger(Passenger p) {
        sPasList.remove(p);
    }

    public void removePassenger(int i) {
        sPasList.remove(i);
    }

    public void removeCar(Car c) {
        sCarList.remove(c);
    }

    public void removeCar(int i) {
        sCarList.remove(i);
    }

    public int getNumber() {
        return sNum;
    }

    public Passenger getPassenger(int i) {
        return sPasList.get(i);
    }

    public ArrayList<Passenger> getPassengers() {
        return sPasList;
    }

    public int getPasNum() {
        return sPasList.size();
    }

    public Car getCar(int i) {
        return sCarList.get(i);
    }

    public ArrayList<Car> getCars() {
        return sCarList;
    }

    public int getCarNum() {
        return sCarList.size();
    }

    public String toString() {
        return super.toString() + " | Number: " + sNum + " | Cars: " + sCarList + " | Passengers: " + sPasList;
    }



}