package models;

/**
 *
 * @author James
 */
public class Admin {
    
    public void assignCourse(UniPeople person, Course course)
    {
        person.course = course;
    }
    
    public void getDetails(UniPeople person)
    {
        if (person.course != null)
        {
            System.out.print(person.id + person.name + person.course.code);
        }
        else 
        {
            System.out.print("person not logged correctly.");
        }
    }  
}
