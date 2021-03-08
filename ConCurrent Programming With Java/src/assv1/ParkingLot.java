package assv1;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParkingLot {

    int plots = 10;
    Semaphore full = new Semaphore(0, true);
    Semaphore empty = new Semaphore(plots, true);
    Ramp r;
    BusQueue bq;
    Buses b;
    ArrayBlockingQueue<Buses> listBus = new ArrayBlockingQueue<Buses>(plots,true);

    public ParkingLot() {
        listBus = new ArrayBlockingQueue<Buses>(plots, true);
    }

    int CheckAvailability() { //Function used to ceck is there is availabe parking slot, if !=0 it let bus in
        int av;
        av = empty.availablePermits();
       // System.out.println("The Number OF permits aavilabel are "+ av);
        return av;
    }

    
    void add(BusQueue bq) {
        Buses b;
        try {
            empty.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(ParkingLot.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Adding Bus to slot");
        listBus.add(bq.listBus.poll());  //Getting the Bus
       // System.out.println(b.getNumber()+" has entered the parking Slot");
        System.out.println("Number of Buses in Parking is " + listBus.size());
        
        b =(Buses) ((ArrayBlockingQueue<?>)listBus).poll();
        System.out.println(b.getNumber());
    }

    void goClean(Buses b) {
        
    }

    void goMaintain() {
    }
}
