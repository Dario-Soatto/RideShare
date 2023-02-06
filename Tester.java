public class Tester {
    public static void main(String [] args) {
        Road r = new Road(5);
        r.popPassengers(5);
        r.popCars(5);
        r.pickup();
        System.out.println(r);
        r.move();
        System.out.println(r);
    }

    /**
     * To Do:
     * Make cars stop and drop off everyone once they get to destination
     * Make passengers drop off at destination
     * Add revenue calculations
     */
}