/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package tutoring.BusinessObjects;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author danielbarboza
 */
public enum Courses {
    
    INSTANCE;
    
    private Set<String> courses;
    
    private Courses() {
        courses = new HashSet<String>();
        
        courses.add("CST 8109 - Network Programming");
        courses.add("CST 2234 - Systems Analysis");
        courses.add("CST 8390 - Data Analytics");
        courses.add("CST 8288 - OOP with Design Patterns");
        courses.add("CST 2335 - Mobile Graphical Interface Programming");
         
    }
    
    
    public void getCourses() {
        for (String course : courses ) {
            System.out.println(course + "\n");
        }
    }
    
    
}
