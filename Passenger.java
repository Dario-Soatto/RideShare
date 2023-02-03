public class Passenger {
    private int destination;
    private int location;

    public Passenger() {
        destination = (int) (Math.random() * 32);
        location = (int) (Math.random() * 32);
    }

    public int getDestination() {
        return destination;
    }

    public int getLocation() {
        return location;
    }
}