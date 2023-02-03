public class Passenger {
    private int destination;
    private int location;
    private int start;

    public Passenger(int myStart, int myDestination) {
        destination = myDestination;
        start = myStart;
        location = start;
    }

    public int getDestination() {
        return destination;
    }

    public int getLocation() {
        return location;
    }

    public String toString() {
        return super.toString() + " Start: "  + start + " Dest: " + destination + " Location: " + location;
    }
}