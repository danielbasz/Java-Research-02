/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.DTO;

/**
 *
 * @author dongkwankim
 */
public class courseDTO {
    private int courseCode;
    private String courseName;
    private String courseDescription;
    
    public int getCourseCode(){
        return courseCode;
    }
    public void setCourseCode(int courseCode){
        this.courseCode = courseCode;
    }
    
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseDescription(){
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription){
        this.courseDescription = courseDescription;
    }
    
    
}
