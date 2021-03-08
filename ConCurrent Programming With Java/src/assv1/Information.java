package assv1;

public class Information {

    void MecRules() {
        System.out.println("\nFor this simulation there are 2 Maintenance Depot");
        System.out.println("Each depot must be manned by atleast one person and a maximum of 3");
        System.out.println("Each depot can have different number of Mechanics (within the boundy) and can have different work speeds");
        System.out.println("Work Speed are Determined by there experience level");
        System.out.println("The max time needed to clean a bus is 5000ms");
        System.out.println("1.Shaves of 100ms\n2.Shaves of 500ms\n3.Shaves of 1000ms  ");
    }

    void CleanRules() {
        System.out.println("\nFor this simulation there are 3 Cleaning Depot");
        System.out.println("Each depot must be manned by atleast one person and a maximum of 3");
        System.out.println("Each depot can have different number of Cleaners (within the boundy) and can have different work speeds");
        System.out.println("Work Speed are Determined by there experience level");
        System.out.println("The max time needed to clean a bus is 5000ms");
        System.out.println("1.Shaves of 100ms\n2.Shaves of 500ms\n3.Shaves of 1000ms  ");
    }
}
