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
public abstract class Lecturer extends UniPeople implements ITeach {
    
    public Lecturer(int id, String name)
    {
        super(id, name);
    }
    
    @Override
    public void setCoursework(String coursework) {
        this.course.coursework = coursework;
    }
    
    @Override
    public void teach() {
        System.out.print(this.name + " is teaching " + this.course.code + 
                " in room " + this.course.room);
    }
}
