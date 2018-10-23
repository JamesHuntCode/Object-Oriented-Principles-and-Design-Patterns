/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author James
 */
public abstract class Student extends UniPeople {
    
    public Student(int id, String name)
    {
        super(id, name);
    }
    
    public void attendClass()
    {
        System.out.print(this.name + " is attending " + this.course.code
        + " in " + this.course.room);
    }
    
    public void doCoursework()
    {
        if (this.course.coursework != null)
        {
            System.out.print(this.name + " is doing coursework " 
                    + this.course.code);
        }
        else 
        {
            System.out.print("NO COURSEWORK SET.");
        }
    }
}
