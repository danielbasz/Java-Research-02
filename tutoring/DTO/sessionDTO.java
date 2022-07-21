/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring.DTO;

import java.util.Date;

/**
 *
 * @author dongkwankim
 */
public class sessionDTO {
    private Date dateKey;
    private Date timeKey;
    private String studentLastName;
    private int sessionStatus;
    private String topic;
    private Integer tutorID;
    private String courseCode;
    private Integer studentID;
    
    public Date getDateKey(){
        return dateKey;
    }
    public void setDatekey(Date dateKey){
        this.dateKey = dateKey;
    }
    
    public Date getTimeKey(){
        return timeKey;
    }
    public void setTimeKey(Date timeKey){
        this.timeKey = timeKey;
    }
    
     public String getStudentLastName(){
        return studentLastName;
    }
    public void setStudentLastName(String studentLastName){
        this.studentLastName = studentLastName;
    }
    
     public Integer getTutorID(){
        return tutorID;
    }
    public void setTutorID(Integer tutorID){
        this.tutorID = tutorID;
    }
    
     public String getCourseCode(){
        return courseCode;
    }
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    
    public Integer getStudentID(){
        return studentID;
    }
    public void setStudentID(Integer studentID){
        this.studentID = studentID;
    }


}
