/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.DTO;

/**
 *
 * @author dongkwankim
 */
public class tutorDTO {
    private Integer tutorID;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private String status;
    private Integer experienceID;
    
    public Integer getTutorID(){
        return tutorID;
    }
    public void setTutorID(Integer tutorID){
        this.tutorID = tutorID;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
    public Integer getExperienceID(){
        return experienceID;
    }
    public void setExperienceID(Integer experienceID){
        this.experienceID = experienceID;
    }

}
