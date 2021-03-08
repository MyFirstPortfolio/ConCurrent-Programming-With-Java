package assv1;

import java.util.Scanner;

public class CleanerGenerater {

    int CleanerNumber;
    CleaningDepot cd;
    Scanner s = new Scanner(System.in);

    public CleanerGenerater(int n, CleaningDepot CD) {
        CleanerNumber = n;
        this.cd = CD;
    }
    
    public CleanerGenerater(CleaningDepot CD) {
        this.cd = CD;
    }

    public void Create() {
        int timer = 0;
        Cleaners cl = new Cleaners(cd);
        Boolean flag = false;

        do {
            System.out.println("Please enter the total number of Cleaner");

            CleanerNumber = s.nextInt();
            if (CleanerNumber > 3 || CleanerNumber < 1) {
                System.out.println("Number of Cleaner in each depot must be between 1-3");
            } else {
                flag = true;
            }
        } while (flag == false);
        System.out.println("done");
        for (int i = 0; i < CleanerNumber; i++) { // 
            //  System.out.println("B "+timer);
            Scanner s = new Scanner(System.in);
            int a = i + 1;
            System.out.println("Enter CleanerNumber " + a + " Exp level for Depot Number");
            //Enter a number between 1-3.  1 shaves off 100 //  2 shaves off 500  //  3 shaves off 100
            int x = s.nextInt();

            if (x <= 0 || x > 3) {
                System.out.println("Enter a number between 1-3");
                i--;
            } else {
                //System.out.println("Success");
                cl.setName("Cleaner Number " + i);

                switch (x) {
                    case 1:
                        timer += 100;
                        //System.out.println("The valu of c after adding is "+ cl.getTimer());
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
        cl.setTimer(timer);
        
        //   System.out.println(cl.getTimer());
    }
}
