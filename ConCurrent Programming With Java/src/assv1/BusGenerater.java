package assv1;

import java.util.Random;

public class BusGenerater implements Runnable {

    BusQueue bq;

    int NumberBuses;
    boolean Closingtime = false;

    public BusGenerater(BusQueue BQ) {
        this.bq = BQ;
        NumberBuses = 10;
    }

    public BusGenerater(BusQueue BQ, int n) {
        this.bq = BQ;
        NumberBuses = n;
    }

    @Override
    public void run() {

        for (int i = 0; i < NumberBuses; i++) {
            if (!Closingtime) {
                Random rand = new Random();
                int m = rand.nextInt(2); //To set weather the bus maintenance    0-1    0 is Healthy // 1 is in need of repair
                int c = rand.nextInt(2); //To Determine if the buse neeeds cleaning           

                Buses bus = new Buses(bq);// Calling From the class Bus
                Thread threadbus = new Thread(bus);
                if (m == 0 && c == 0) { //To prevent a fine bus from entering the queue.
                    i--;
                    bus.setNumber("rejected");
                } else {
                    bus.setNumber("BuseNo " + threadbus.getId()); // Seting the Name for the buses in queue
                    bus.setMaintenace(m);
                    bus.setclean(c);
                }
                threadbus.start();

                try {
                    Thread.sleep(1000); // Wait a second before generating new bus
                } catch (InterruptedException e) {
                    System.out.println("Failed to sleep");
                }
            } else {
                break;
            }
        }
        System.out.println("All Busses Generated");
    }

    public synchronized void setclosingTime() {
        System.out.println("The Depot will not be taking any more buses today");
        Closingtime = true;
    }
}
