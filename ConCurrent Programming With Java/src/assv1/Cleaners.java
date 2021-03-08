package assv1;

//use timer or exp to determine time taken
public class Cleaners implements Runnable {
    String Cname;
    int xp;
    int time ;
    CleaningDepot cd;
    
    public Cleaners(CleaningDepot CD){
        this.cd = CD;
    }
    
    public Cleaners(){
      Cname = "TestMaintenace";
      xp= 1;
    }
    
    public void setName(String Name){
        this.Cname = Name;
    }
    
    public void setexp (int C){
        this.xp= C;
    }
    
    public void setTimer(int timer){
       this.time = timer; 
    }
        
    public String getName(){
        return Cname;
    }
    
    public int getexp(){
        return xp;
    }
    
    public int getTimer(){
       return time;
   }
    public void run(){
        cd.addt(this);
    }
}
