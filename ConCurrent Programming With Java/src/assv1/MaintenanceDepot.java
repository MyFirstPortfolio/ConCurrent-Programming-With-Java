package assv1;

public class MaintenanceDepot implements Runnable {

    Maintenace m;
    int timer;

    public MaintenanceDepot() {
        timer = 5000;
    }

    // to calculate the time need for th e task to finish
    void addt(Maintenace m) {

        timer -= m.getTimer();

    }

    public void run() {

        System.out.println("the timer for maintenace work is " + timer);
    }

}
