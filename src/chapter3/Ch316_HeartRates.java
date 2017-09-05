package chapter3;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.*;


/**
 * Created by ola on 8/25/17.
 */
public class Ch316_HeartRates {
    String firstName;
    String lastName;
    int bmonth;
    int bday;
    int byear;

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

    public int getBMonth() {
        return bmonth;
    }

    public void setBMonth(int bmonth) {
        this.bmonth = bmonth;
    }

    public int getBDay() {
        return bday;
    }

    public void setBDay(int bday) {
        this.bday = bday;
    }

    public int getBYear() {
        return byear;
    }

    public void setBYear(int byear) {
        this.byear = byear;
    }

    Ch316_HeartRates() {

    }

    Ch316_HeartRates(String firstName, String lastName, int bday, int bmonth, int byear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
    }

    //calculates age of a patient
    public int calculateAge(int bday, int bmonth, int byear) {
        int age = 0;
        LocalDateTime today;
        LocalDateTime birthday;
        today = LocalDateTime.now();
        birthday = LocalDateTime.of(byear, bmonth, bday, today.getHour(), today.getMinute());
        return today.getYear() - birthday.getYear();
    }

    //target heart rate
    public int targetHeartrate(int age) {
        return (int) ((220 - age) * (0.8));
    }

    // maximum heart rate
    public int maximumHeartrate(int age) {

        return 220 - age;
    }
    //display patient data

    //prompt for data
    public Ch316_HeartRates updatePatientData(Ch316_HeartRates patient) {
        Scanner s = new Scanner(System.in);
        System.out.println("Your first name:");
        patient.setFirstName(s.nextLine());
        System.out.println("Your last name:");
        patient.setLastName(s.nextLine());
        System.out.println("When is your birthday?");
        System.out.println("Day:");
        patient.setBDay(s.nextInt());
        System.out.println("Month:");
        patient.setBMonth(s.nextInt());
        System.out.println("Year:");
        patient.setBYear(s.nextInt());
        return patient;
    }

    public void displayPatientData(Ch316_HeartRates patient) {
        System.out.printf("Patient:\n");
        System.out.printf("-------\n");
        System.out.printf("First name: %s\n", patient.getFirstName());
        System.out.printf("Last name: %s\n", patient.getLastName());
        System.out.printf("Date of birth: %d/%d/%d \n", patient.getBDay(), patient.getBMonth(), patient.getBYear());
        System.out.printf("Age: %d\n", patient.calculateAge(patient.getBDay(), patient.getBMonth(), patient.getBYear()));
        System.out.printf("Max heart rate: %d\n", patient.maximumHeartrate(patient.calculateAge(patient.getBDay(), patient.getBMonth(), patient.getBYear())));
        System.out.printf("Target heart rate: %d\n", patient.targetHeartrate(patient.calculateAge(patient.getBDay(), patient.getBMonth(), patient.getBYear())));
    }

    public static void main(String[] args) {

        Ch316_HeartRates hr = new Ch316_HeartRates();
        hr.updatePatientData(hr);
        hr.displayPatientData(hr);

    }

}