package assv1;

public class CleaningDepot /*implements Runnable */ {

    Cleaners c;
    int timer;

    public CleaningDepot() {
        timer = 5000;
    }

    // to calculate the time need for th e task to finish
    void addt(Cleaners c) {

        timer -= c.getTimer();

    }

    void getb(Buses b) {//Get Buses from parking

    }
}
