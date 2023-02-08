public class Tester {
    public static void main(String [] args) {
        int total = 0;
        int numStations = 32;
        int numPassengers = 50;
        int numCars = 20;
        int numTrials = 100;
        for(int i = 0; i < 100; i++) {
            Road r = new Road(numStations);
            r.popPassengers(numPassengers);
            r.popCars(numCars);
            for(int j = 0; j < numStations; j++) {
                r.pickup();
                r.move();
            }
            total += r.getRevenue();
            //System.out.println(r.getRevenue());
        }
        System.out.println(total/numTrials/numCars);
        

        //System.out.println(r);
    }
}