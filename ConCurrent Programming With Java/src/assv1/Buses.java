package assv1;
public class Buses implements Runnable {
    String Name;
    BusQueue bq;
    int m = 0, c = 0;
    
    public Buses(BusQueue BQ){
        this.bq =BQ;
        
    }
    
    public Buses(){
        Name = "Test";
        m = 0;
        c = 1;
    }
    public void setNumber(String Name){
        this.Name = Name;
    }
    
    public void setMaintenace(int M){
        this.m = M;
    }
    
    public void setclean (int C){
        this.c= C;
    }
    
    public String getNumber(){
        return Name;
    }
    
    public int getMaintenace(){
        return m;
    }
    
    public int getclean(){
        return c;
    }
    
    @Override
    public void run(){
        bq.add2Q(this);
        //bq.enter(this);
    }


}
