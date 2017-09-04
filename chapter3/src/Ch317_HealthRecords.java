import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Created by ola on 8/27/17.
 */
public class Ch317_HealthRecords {
    String firstName;
    String lastName;
    int bmonth;
    int bday;
    int byear;
    int weight;
    int height;
    String gender;


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

    public int getBMonth() { return bmonth; }

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.equals("F") || gender.equals("f") ){
            this.gender = "Female";
        } else if(gender.equals("M") || gender.equals("m") ){
            this.gender = "Male";
        }

    }

    //calculates age of a patient
    public int calculateAge(Ch317_HealthRecords patient){
        // int age = 0;
        LocalDateTime today;
        LocalDateTime birthday;
        today = LocalDateTime.now();
        birthday = LocalDateTime.of(patient.getBYear() , getBMonth(), patient.getBDay(), today.getHour(), today.getMinute());
        return today.getYear() - birthday.getYear();
    }
    //calculates BMI of a patient
    public int calculateBMI(Ch317_HealthRecords patient){
        // int age = 0;

        return ((patient.getWeight()*10000)/((patient.getHeight()*patient.getHeight()))) ;
    }

    public void displayPatientData(Ch317_HealthRecords patient){
        System.out.printf("Patient:\n");
        System.out.printf("-------\n");
        System.out.printf("First name: %s\n", patient.getFirstName());
        System.out.printf("Last name: %s\n", patient.getLastName());
        System.out.printf("Gender: %s\n", patient.getGender());
        System.out.printf("Weight: %s\n", patient.getWeight());
        System.out.printf("Height (centimeters): %s\n", patient.getHeight());
        System.out.printf("Date of birth: %d/%d/%d \n", patient.getBDay(), patient.getBMonth(), patient.getBYear());
        System.out.printf("Age: %d\n", patient.calculateAge(patient));
        System.out.printf("Max heart rate: %d\n", patient.maximumHeartrate(patient));
        System.out.printf("Target heart rate: %d\n", patient.targetHeartrate(patient));
        System.out.printf("BMI: %d\n", patient.calculateBMI(patient));

    }

    //target heart rate
    public int targetHeartrate(Ch317_HealthRecords patient){
        return (int)((220-patient.calculateAge(patient))*(0.8));
    }
    // maximum heart rate
    public int maximumHeartrate(Ch317_HealthRecords patient){

        return 220-patient.calculateAge(patient);
    }
    public String validate(String s){
        if(s.equals("")){
            System.out.println("You didn't enter any data.");
        }
        return s;
    }

    //prompt for data
    public Ch317_HealthRecords updatePatientData(Ch317_HealthRecords patient){

        Scanner s  = new Scanner(System.in);

        System.out.println("Your first name:");
        patient.setFirstName(s.nextLine());

        System.out.println("Your last name:");
        patient.setLastName(s.nextLine());

        System.out.println("Your gender (F - female, M - male:");
        patient.setGender(s.nextLine());

        System.out.println("When is your birthday?");
        System.out.println("Day:");
        patient.setBDay(s.nextInt());
        System.out.println("Month:");
        patient.setBMonth(s.nextInt());
        System.out.println("Year:");
        patient.setBYear(s.nextInt());

        System.out.println("Weight:");
        patient.setWeight(s.nextInt());
        System.out.println("Height:");
        patient.setHeight(s.nextInt());
        return patient;
    }
    Ch317_HealthRecords(){

    }
    Ch317_HealthRecords(String firstName, String lastName, int bday, int bmonth, int byear, String gender, int weight, int height){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }


    public static  void main(String[] args){

        Ch317_HealthRecords hr = new Ch317_HealthRecords();
        hr.updatePatientData(hr);
        hr.displayPatientData(hr);

    }
}
