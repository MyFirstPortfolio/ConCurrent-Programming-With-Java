 package assv1;

//use timer or exp to determine time taken
public class Maintenace  {
    String Mname;
    int xp;
    int time ;
    MaintenanceDepot md;
    
    public Maintenace(MaintenanceDepot MD){
        this.md = MD;
    }
    
    public Maintenace(){
      Mname = "TestMaintenace";
      xp= 1;
    }
    
    public void setName(String Name){
        this.Mname = Name;
    }
    
    public void setexp (int C){
        this.xp= C;
    }
    
    public void setTimer(int timer){
       this.time = timer; 
    }
        
    public String getName(){
        return Mname;
    }
    
    public int getexp(){
        return xp;
    }
    
    public int getTimer(){
       return time;
   }
    public void add(){
        md.addt(this);
    }
}
