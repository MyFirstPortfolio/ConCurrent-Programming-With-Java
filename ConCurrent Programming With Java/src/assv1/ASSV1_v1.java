/*package assv1;

import java.util.Scanner;

public class ASSV1_v1 {
    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        Information in = new Information();
        int b = 0;  
        
       // Creating new busses to add to the queue,
        System.out.println("Please enter the number of Buses expected");
        
        //Take any value and make it positive  ( Doesnt prevent Zero from running)
        b = Math.abs(b = s.nextInt());
         
        //getting Bus in line outside the car park
        BusQueue bq = new BusQueue();
        BusGenerater bg = new BusGenerater(bq,b);
        Thread threadbg = new Thread(bg);
        
        
        //Declaring the clock & weather
        Weather w = new Weather();
        WeatherTh wth = new WeatherTh();
        Countdown Clock = new Countdown(bg ,wth);
          
        //Creatin the Cleanig Depot thread , and then creating cleaning for each member
        //maximum number you can add is 3 per cd
       
      /*  //Declaring Cleaning Depots
        CleaningDepot cd = new CleaningDepot();
        CleaningDepot cd1 = new CleaningDepot();
        CleaningDepot cd2 = new CleaningDepot();
        in.CleanRules();
        
        // To Create the worker (Only Used for timing for know
        CleanerGenerater cg = new CleanerGenerater(cd);
        CleanerGenerater cg1 = new CleanerGenerater(cd1);
        CleanerGenerater cg2 = new CleanerGenerater(cd2);
        cg.Create();
        cg1.Create();
        cg2.Create();
        //Declaring CDepot Threads
        Thread thcd1 = new Thread(cd);
        Thread thcd2 = new Thread(cd1);  
        Thread thcd3 = new Thread(cd2);
        
        
        //Declaring Maintenenae Depots
        MaintenanceDepot md = new MaintenanceDepot();
        MaintenanceDepot md2 = new MaintenanceDepot();
        in.MecRules();
        
        MaintenanceGenerater mg = new MaintenanceGenerater(md);
        MaintenanceGenerater mg2 = new MaintenanceGenerater(md2);
        mg.Create();
        mg2.Create();
        
        Thread thmd1 = new Thread(md);
        Thread thmd2 = new Thread(md2);
        
        // Starting all the threads
        threadbg.start();   
        /*thcd1.start();   
        thcd2.start();   
        thcd3.start();   
        thmd1.start();   
        thmd2.start();   
        Clock.start();
    }
}*/

