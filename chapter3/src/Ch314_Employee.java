/**
 * Created by ola on 8/25/17.
 */
public class Ch314_Employee {
    private String firstName;
    private String lastName;
    private double monthySalary;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthySalary() {
        return monthySalary;
    }

    public void setMonthySalary(double monthySalary) {
        if (monthySalary >= 0) {
            this.monthySalary = monthySalary;
        }else{
            System.out.println("Salary must be >=0");
        }
    }

    public Ch314_Employee(String firstName, String lastName, double monthySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthySalary = monthySalary;
    }
    public static void main(String[] args){
        Ch314_Employee employee1 = new Ch314_Employee("Bob", "Snob", 1000);
        Ch314_Employee employee2 = new Ch314_Employee("Tob", "Knob", 0);
        System.out.printf("%s %s : %.2f\n", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthySalary() );
        System.out.printf("%s %s : %.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.getMonthySalary() );
        employee1.setMonthySalary(-400);
        employee2.setMonthySalary(3000);
        System.out.printf("%s %s : %.2f\n", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthySalary() );
        System.out.printf("%s %s : %.2f\n", employee2.getFirstName(), employee2.getLastName(), employee2.getMonthySalary() );
    }

}
