import java.util.Scanner;

/**
 * Created by ola on 8/30/17.
 */
public class Ch420_SalaryCalc {


    private String firstName = new String();
    private String lastName = new String();
    private int hourlyRate;
    private int hoursPerMonth;
    private int baseHours = 40;
    private double overtimeRate = 1.5;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }

    public void setHoursPerMonth(int hoursPerMonth) {
        this.hoursPerMonth = hoursPerMonth;
    }

    public int getBaseHours() {
        return baseHours;
    }

    public void setBaseHours(int baseHours) {
        this.baseHours = baseHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(int overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public Ch420_SalaryCalc updateEmployee(Ch420_SalaryCalc employee){
        Scanner s = new Scanner(System.in);
        System.out.println("First Name:");

            employee.setFirstName(s.nextLine());

        System.out.println("Last Name:");

            employee.setFirstName(s.nextLine());

        System.out.println("Hourly rate:");
        employee.setHourlyRate(s.nextInt());

        System.out.println("Hours worked per month:");
        employee.setHoursPerMonth(s.nextInt());

        return employee;
    }

    public int calculateSalary(Ch420_SalaryCalc employee){
        if (employee.getHoursPerMonth()>40){
           return (int) (employee.getHoursPerMonth()*employee.getHourlyRate() + employee.getHourlyRate()*employee.getOvertimeRate()* (employee.getHoursPerMonth()-employee.getBaseHours()));
        }else {
            return (int) (employee.getHoursPerMonth()*employee.getHourlyRate());
        }

    }
    public void displayEmployeeData(Ch420_SalaryCalc employee){
        System.out.printf("Gro ss salary for %s %s: %d\n", employee.getFirstName(), employee.getLastName(), employee.calculateSalary(employee));
    }

    public  static void main(String[] args){
        Ch420_SalaryCalc employee1 = new Ch420_SalaryCalc();
        Ch420_SalaryCalc employee2 = new Ch420_SalaryCalc();
        Ch420_SalaryCalc employee3 = new Ch420_SalaryCalc();

        employee1.updateEmployee(employee1);
        employee2.updateEmployee(employee2);
        employee3.updateEmployee(employee3);

        employee1.displayEmployeeData(employee1);
        employee2.displayEmployeeData(employee2);
        employee3.displayEmployeeData(employee3);
    }
}
