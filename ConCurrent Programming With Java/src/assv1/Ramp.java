package assv1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ramp {

    public Ramp() {
    }

    synchronized void EnterBQ() {
    }

    synchronized void ExitBQ() {
    }

    synchronized void EnterP() {
    }

    synchronized void Exitp() {
    }

    synchronized void deny() {
    }
}

// Its a Safe Ramp , not Sure if i need to make it fair yet
class SafeRamp extends Ramp {

    private int parking;
    private int BQueue;

    @Override
    synchronized void EnterBQ() {
        System.out.println("Bus has Entered the ramp");
        while (parking > 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(SafeRamp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ++BQueue;
    }

    synchronized void ExitBQ() {
        System.out.println("Bus is exiting the ramp");
        --BQueue;
        if (BQueue == 0) {
            notifyAll();
        }
    }

    synchronized void EnterP() {
        while (BQueue > 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(SafeRamp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ++parking;
    }

    synchronized void ExitP() {
        --parking;
        if (parking == 0) {
            notifyAll();
        }
    }
}
