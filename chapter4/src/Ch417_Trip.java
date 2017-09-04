import java.util.Scanner;

/**
 * Created by ola on 8/30/17.
 */
public class Ch417_Trip {

    int distance;
    int gasUsed;
    int totalMillage;
    int totalGas;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(int gasUsed) {
        this.gasUsed = gasUsed;
    }

    public int getTotalMillage() {
        return totalMillage;
    }

    public void setTotalMillage(int totalMillage) {
        this.totalMillage = totalMillage;
    }

    public int getTotalGas() {
        return totalGas;
    }

    public void setTotalGas(int totalGas) {
        this.totalGas = totalGas;
    }

    public  static void main(String[] args){
        Ch417_Trip trips = new Ch417_Trip();
        Scanner s = new Scanner(System.in);
        String flag = new String();
        while (!(flag.equals("N")||flag.equals("n"))){
            System.out.println("Enter millage for your trip (km):");
            trips.setDistance(s.nextInt());
            System.out.println("Enter gas used for your trip (liters):");
            trips.setGasUsed(s.nextInt());

            trips.setTotalGas(trips.getGasUsed()+ trips.getTotalGas());
            trips.setTotalMillage(trips.getDistance() + trips.getTotalMillage());

            System.out.printf("This trip consumption %.2f  km/liter\n", (float)trips.getDistance()/trips.getGasUsed());
            System.out.printf("Avarage trip consumption %.2f km/liter\n", (float)trips.getTotalMillage()/trips.getTotalGas());
            System.out.printf("Add new trip? (Y/N)\n");
            flag = s.next();
        }
        System.out.printf("Thank you. Avarage trip consumption %.2f km/liter\n", (float)trips.getTotalMillage()/trips.getTotalGas());
    }
}
