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
import java.util.HashSet;

/**
 * Converter class models a generalist unit converter. It uses strategy design patterns
 * to model other specific unit converters, namely temperature and length unit converters.
 * @author danielbarboza
 */
public class User {

    private int userID;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private ArrayList<String> courses;
    private String status;
    private int experienceID;
    private UserStrat strategy;
    
    public void changeStratTo ( UserStrat strategy ) {
        this.strategy = strategy;
        this.experienceID = 1;
        this.status = strategy.getStatus();
    }
    

    /**
     * Default constructor for Converter class
     * Determines the default behavior of our unit strategy.
     */
    public User() {
        this.strategy = new Student();
    }
    
    public User(UserBuilder builder)
	{
		userID = builder.getUserID();
		firstName = builder.getFirstName();
		lastName = builder.getLastName();
		phone = builder.getPhone();
		email = builder.getEmail();
                status = builder.getStatus();
                experienceID = builder.getExperience();
                strategy = builder.getUserStrat();  
	}

  public String getCourses(ArrayList<String> courses) {
        
        String result = null;
        
        if (courses != null) {
            for ( String a : courses) {
                result = result + a + " ";
            }
        }   
        return result;
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
  
  public int getExperience() {
      return experienceID;
  }
  
  public UserStrat getUserStrat() {
      return strategy;
  }
  
    public void setFirstName(String firstName) {
      this.firstName = firstName;
  }
  
    public void setLastName(String lastName) {
      this.lastName = lastName;
  }
  
    public void setPhone(String phone) {
      this.phone = phone;
  }
  
  public void setEmail(String email) {
      this.email = email;
  }
  
   public void setCourse(String course) {
      this.courses.add(course);
  }
  
  public void setStatus(String status) {
      this.status = status;
  }
  
  public void setExperience(int experience) {
      this.experienceID = experience;
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
                .append(String.format("%s %s%n", firstName, lastName))
                .append("StudentID: ")
                .append(String.format("%d%n", userID))
                .append("Phone: ")
                .append(String.format("%s%n", phone))
                .append("Email: ")
                .append(String.format("%s%n", email))
                .append("Courses: ")
                .append(String.format("%s ", getCourses(courses)))
                .append("\nStatus: ")
                .append(String.format("%s%n", status))
                .append("ExperienceID: ")
                .append(String.format("%d%n", experienceID))
                .append("Unit behaviour type: ")
                .append(strategy.thisUserStrategy());
        return builder.toString();
    }
    
    public String tutorSwitch() {
        
        this.status = strategy.tutorSwitch(experienceID);
        
        if ( this.status.equals("Tutoring OFF")) {
            changeStratTo(new Student());
        }
        else if ( this.status.equals("Tutoring ON")) {
            changeStratTo(new Tutor());
        }
        else { System.out.println(status);
        this.status = "Tutoring OFF";
        }
        return status;
    }
    
     public String thisUserStrategy() {
        return strategy.thisUserStrategy();
    } 
}
