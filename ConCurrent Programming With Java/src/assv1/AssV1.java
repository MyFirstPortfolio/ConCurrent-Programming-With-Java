package assv1;
import java.util.Scanner;

public class AssV1 {
    public static void main(String[] args) {  
    Scanner s = new Scanner(System.in);
        Information in = new Information();
        int b = 0;  
        
       // Creating new busses to add to the queue,
        System.out.println("Please enter the number of Buses expected");
        
        //Take any value and make it positive  ( Doesnt prevent Zero from running)
        b = Math.abs(b = s.nextInt());
        
        Ramp r = new SafeRamp();
        //Declaring Ramp and ParkingLot
        ParkingLot p = new ParkingLot();
        
        //getting Bus in line outside the car park
        BusQueue bq = new BusQueue(r, p);
        BusGenerater bg = new BusGenerater(bq,b);
        Thread threadbg = new Thread(bg);
 
        
        
        //Declaring the clock & weather
        WeatherTh wth = new WeatherTh();
        Countdown Clock = new Countdown(bg ,wth);

        threadbg.start();  
        Clock.start();
        
        
    }
}
