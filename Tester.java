public class Tester {
    public static void main(String [] args) {
        int total = 0;
        for(int i = 0; i < 100; i++) {
            Road r = new Road(31);
            r.popPassengers(50);
            r.popCars(20);
            for(int j = 0; j < 32; j++) {
                r.pickup();
                r.move();
            }
            total += r.getRevenue();
            System.out.println(r.getRevenue());
        }
        System.out.println(total/100/20);
        

        //System.out.println(r);
    }
}