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


import java.util.HashSet;
import tutoring.BusinessObjects.Student;

/**
 * UnitStrategy interface models a generic Unit Converter
 * Our Unit converters have the convert method that accepts the amount
 * to convert and the type to convert from.
 * unitStrategyType method will return the unit conversion strategy we are using
 * The strategies are Temperature ( for Celsius/Fahrenheit conversion )
 * and Length ( for inches/meters conversion )
 * getCounterType will return the unit that our conversion is converting to.
 * @author danielbarboza
 */
public class UserBuilder {
    
    private int userID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private HashSet<String> courses = new HashSet<>();
    private String status;
    private int experienceID;
    private UserStrat strategy = new Student();
    
    private UserBuilder() {
    }
    
    public static UserBuilder create() {
        return new UserBuilder();
    }
    
    public UserBuilder userID (int userID) {
        this.userID = userID;
        return this;
    }
    
    public UserBuilder firstName (String firstName) {
        this.firstName = firstName;
        return this;
    }
     
    public UserBuilder lastName (String lastName) {
        this.lastName = lastName;
        return this;
    }
    
     public UserBuilder phone (String phone) {
        this.phone = phone;
        return this;
    }
     
    public UserBuilder email (String email) {
        this.email = email;
        return this;
    }
    
    public UserBuilder course (String course) {
        courses.add(course);
        return this;
    }
    
    public UserBuilder status (String status) {
        this.status = status;
        return this;
    }
    
    public UserBuilder userStrat (UserStrat userStrat) {
        this.strategy = new Student();
        return this;
    }
    
    public User build() {
        return new User(this);
    }
    
    
     public int getUserID() {
        return userID;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getCourses(HashSet<String> courses) {
        
        String result = null;
        
        if (courses != null) {
            for ( String course : courses) {
                result = result + course + " ";
            }
        }   
        return result;
    }
    
    public int getExperience() {
        return experienceID;
    }
    
    public UserStrat getUserStrat() {
        return strategy;
    }
    
    
    
    
 
}
