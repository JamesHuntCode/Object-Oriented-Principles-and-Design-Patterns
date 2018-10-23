package models;

/**
 *
 * @author James
 */
public class Admin {
    
    public static void assignCourse(UniPeople person, Course course)
    {
        person.course = course;
    }
    
    public static void getDetails(UniPeople person)
    {
        System.out.print(person.id + person.name + person.course.code);
    }
}
