package assv1;

public class Countdown implements Runnable {
    Thread counter;
    static int N = 30;  // Time in secondsd
    BusGenerater bg; //
    WeatherTh wth; // To stop the weather Generating thread at the end of the day.
    
    public Countdown(BusGenerater bg , WeatherTh wths){
        this.bg = bg;
        this.wth = wths;
    }
   
    public void start() {
        counter = new Thread(this);
        counter.start();
        ;
    }

    public void run() {
        while (N > 0) {
            try {
                counter.sleep(1000); 
            } catch (Exception ex) {
            }
            //System.out.println(N);
            N--;
        }
        ClosingTime();  
    }
    
    public synchronized void ClosingTime(){
        System.out.println("The Workshop is closing ");
        bg.setclosingTime();
        wth.SetClosingTime();
                 
    }
}

