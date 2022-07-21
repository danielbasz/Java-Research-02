/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.BusinessObjects;

/**
 *
 * @author danielbarboza
 */
public class Control {
    
    public static void main(String[] args) {
        
   
       Courses courses = Courses.INSTANCE;
        
       courses.getCourses();
        
        User dk = UserBuilder.create().userID(1).firstName("d").lastName("k").course("CST 1100").build();
        
        dk.changeStratTo(new Tutor());
        
        dk.changeStratTo(new Student());
        
        dk.setExperience(1);
        
        dk.tutorSwitch();
        
        dk.tutorSwitch();
        
        System.out.println(dk.toString());
        
        
    }
    
}
