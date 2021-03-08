package assv1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
// To simulate change of weather during the day


public class WeatherTh implements Runnable{
    Thread weatherTh;
    int weaValue;
    boolean ClosingTime = false;
    
    public WeatherTh(){
       
    }
    
    
    public void run() {
        while(!ClosingTime){
        Random r = new Random();
        
        weaValue = r.nextInt(2);     //0 is sunny   1 is rainy
        Weather w = new Weather();
        w.setWeather(weaValue);
        
        try {
            weatherTh.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WeatherTh.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    };
    
    public void SetClosingTime(){ 
        System.out.println("Stopping Weather Generation");
        ClosingTime = true;
    }
    
}
