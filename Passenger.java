public class Passenger {
    private int pDest;
    private int pStart;
    private int pDir;

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

    public int getDestination() {
        return pDest;
    }

    public int getDirection() {
        return pDir;
    }

    public String toString() {
        return super.toString() + " | Start: "  + pStart + " | Dest: " + pDest;
    }
}