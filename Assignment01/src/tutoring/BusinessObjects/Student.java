/**
 * Strategy design pattern lab exercise models a generalist unit converter that can be adapted
 * to various specific unit conversions ( in our case, Celsius to Fahrenheit and vice versa,
 * and meters to inches and vice versa )
 * The Converter class uses the strategy design pattern to change it's behavior to Length or Temperature conversion.
 * Course: CST 8288
 * Last updated on: June 1st
 * @author Daniel Barboza
 */
package tutoring.BusinessObjects;

import java.util.ArrayList;

/**
 * Converter class models a generalist unit converter. It uses strategy design patterns
 * to model other specific unit converters, namely temperature and length unit converters.
 * @author danielbarboza
 */
public class Student implements UserStrat {

    private int userID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private ArrayList<String> courses;
    private String status = "Tutoring OFF";
    private int experienceID;
    private UserStrat strategy;
    
 
    /**
     * Default constructor for Converter class
     * Determines the default behavior of our unit strategy.
     */
 

    public String getCourses(ArrayList<String> courses) {
        
        String result = null;
        
        if (courses != null) {
            for ( String course : courses) {
                result = result + course + " ";
            }
        }   
        return result;
    }
   
    /**
     * toString method returns the original amount, the converted amount
     * and what strategy we are using on our unit converter.
     * @return the built string of our unit conversion object
     */
   @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Name: ")
                .append(String.format("%s %s%n ", firstName, lastName))
                .append("StudentID: ")
                .append(String.format("%d%n", userID))
                .append("Phone: ")
                .append(String.format("%s%n ", phone))
                .append("Email: ")
                .append(String.format("%s%n ", email))
                .append("Courses: ")
                .append(String.format("%s ", getCourses(courses)))
                .append("%nStatus: ")
                .append(String.format("%s%n ", status))
                .append("ExperienceID: ")
                .append(String.format("%d%n ", experienceID))
                .append("Unit behaviour type: ")
                .append(strategy.thisUserStrategy());
        return builder.toString();
    }
    
     public String getStatus() {
        return this.status;
    }
    
    
    public String tutorSwitch(int xp) {
        if ( xp > 0 ) {
            this.status = "Tutoring ON";
        }
        else {
            return "\nYou need to be a student with experience to tutor\n";
        }
        return status;
    }
    
    public String thisUserStrategy() {
        return "This is a Student";
    }
    
}
