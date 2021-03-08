package assv1;

import java.util.Scanner;

public class MaintenanceGenerater {

    int Maintenancenumber;
    MaintenanceDepot md;

    public MaintenanceGenerater(int n, MaintenanceDepot MD) {
        Maintenancenumber = n;
        this.md = MD;
    }
    
    
    public MaintenanceGenerater(MaintenanceDepot MD) {
        
        this.md = MD;
    }

    public void Create() {
        int timer = 0;
        Boolean flag = false;
        Scanner s = new Scanner(System.in);
        
        do {
            System.out.println("Please enter the total number of Maintnace Work int this Depot");

            Maintenancenumber = s.nextInt();
            if (Maintenancenumber > 3 || Maintenancenumber < 1) {
                System.out.println("Number of Cleaner in each depot must be between 1-3");
            } else {
                flag = true;
            }
        } while (flag == false);
        
        Maintenace mt = new Maintenace(md);
        for (int i = 0; i < Maintenancenumber; i++) { // 
            //  System.out.println("B "+timer);
            
            int a = i + 1;
            System.out.println("Enter Maintenance " + a + " Exp level for Depot Number");
            //Enter a number between 1-3.  1 shaves off 100 //  2 shaves off 500  //  3 shaves off 100
            int x = s.nextInt();

            if (x <= 0 || x > 3) {
                System.out.println("Enter a number between 1-3");
                i--;
            } else {
                mt.setName("Maintenance " + i);
                switch (x) {
                    case 1:
                        timer += 100;
                        //System.out.println("The value of c after adding is "+ cl.getTimer());
                        break;
                    case 2:
                        timer += 500;
                        break;
                    case 3:
                        timer += 1000;
                        break;
                    default:
                        break;
                }
            }
            //   System.out.println("C" +timer);
        }
        mt.setTimer(timer);
        mt.add();
        //   System.out.println(cl.getTimer());
    }
}
