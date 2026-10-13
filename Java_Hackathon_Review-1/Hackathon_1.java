public class Hackathon_1 {

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        double totalenergy = morningEnergy + eveningEnergy;
        return totalenergy;

    }

    public static void main(String[] args) {

    //Solution 2A :

        System.out.println("===================================");
        System.out.println();
        System.out.println("      *** 2A - Datatypes ***     ");
        System.out.println();
        int id = 167;
        double energy = 16767.67;
        int noofpanels = 5;
        char sysstatus = 'A';

        System.out.println("Panel Id               : " + id);
        System.out.println("Energy (in kWh)        : "+energy);
        System.out.println("Number Of Solar Panels : " + noofpanels);
        System.out.println("System Status          : " + sysstatus);
        System.out.println();
        System.out.println("===================================");
        System.out.println();


    // Solution 2B :

        System.out.println(" *** 2B Conditional Statements *** ");
        System.out.println();

        if (energy >= 10000) {
            System.out.println("Good Energy Conservation");
        }

        else {
            System.out.println("Low Energy Conservation");
        }
        System.out.println();
        System.out.println("===================================");
        System.out.println();

    //Solution 2C :
    
        System.out.println("        *** 2C METHODS ***       ");
        System.out.println();
        double totalenergy = calculateTotalEnergy(5000, 9000);
        System.out.println("Total Energy : " + totalenergy);
        System.out.println();
        System.out.println("===================================");
    }
}
