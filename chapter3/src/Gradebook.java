/**
 * Created by ola on 8/25/17.
 */
public class Gradebook {

    String courseName;
    String insructorName;


    Gradebook(String courseName, String insructorName){
        this.courseName = courseName;
        this.insructorName = insructorName;

    }
    public void setCourseName(String courseNamename){
        courseName = courseNamename;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setInsructorNameName(String insructorName){
        insructorName = insructorName;
    }
    public String getInsructorName(){
        return insructorName;
    }

    void displayMessage(){
        System.out.printf("%s, this course is presented by: %s",courseName, insructorName);
    }

    public static void main(String[] args){
        Gradebook gb = new Gradebook("Lalki", "Bob Stewart");
        gb.displayMessage();
    }

}
