package assv1;

import assv1.Ramp;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BusQueue {

    LinkedBlockingQueue<Buses> listBus = new LinkedBlockingQueue<>();
    Buses b;
    Ramp r;
    ParkingLot pl;

    public BusQueue(Ramp R, ParkingLot p) {
        //Uses Linked because it can be unbounded unlike array blocking Queue 
        this.r = R;
        this.pl = p;
    }

    void add2Q(Buses b) {
        if (!"rejected".equals(b.getNumber())) {
            System.out.println(b.getNumber() + " Waiting for entry ");

            // Add the Active Bus Thread into the Queue to be pulled later on.
            listBus.add(b);
            System.out.println("The Bus Line size is " + listBus.size());
            enter(b);
        }
    }

    void enter(Buses b) {

        if (pl.CheckAvailability() != 0) {
            System.out.println("Bus Is Requesting entry");
            r.EnterBQ();    
            r.ExitBQ();
            pl.add(this);

        } else {
            
            System.out.println("Parking is full, please wait");
        }
    }

    void leave() {
    }
    //need help
}
