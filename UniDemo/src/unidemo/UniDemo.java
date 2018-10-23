package unidemo;

import models.*;

/**
 *
 * @author James
 */
public class UniDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare the required objects:
        Lecturer l = new Lecturer(1, "John");
        Student s = new Student(2, "Jim");
        Course c = new Course("260", "BGB405");
        Admin a = new Admin();
        
        // Log details to the console:
        a.getDetails(s);
        
        // Give the lecturer and the student a course:
        a.assignCourse(l, c);
        a.assignCourse(s, c);
        
        // Make the lecturer teach and the student attend:
        l.teach();
        s.attendClass();
        
        // Make the student attemt the coursework:
        s.doCoursework();
        
        // Make the lecturer set the coursework:
        l.setCoursework("essay");
        
        // Make the student attempt the coursework:
        s.doCoursework();
        
        // Print out the details of the lecturer:
        a.getDetails(l);
        
    }   
    
}
