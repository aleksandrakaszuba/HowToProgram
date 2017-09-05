package chapter3;

/**
 * Created by ola on 8/25/17.
 */
public class Ch315_Date {
    int month;
    int day;
    int year;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Ch315_Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d \n", day, month, year);
    }

    ;

}