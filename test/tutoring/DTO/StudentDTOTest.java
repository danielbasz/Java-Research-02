/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tutoring.DTO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danielbarboza
 */
public class StudentDTOTest {
    
    public StudentDTOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentID method, of class StudentDTO.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        StudentDTO instance = new StudentDTO();
        instance.setStudentID(20);
        Integer expResult = 20;
        Integer result = instance.getStudentID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setStudentID method, of class StudentDTO.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        Integer studentID = 20;
        StudentDTO instance = new StudentDTO();
        instance.setStudentID(studentID);
        Integer result = instance.getStudentID();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(studentID, result);
    }

    /**
     * Test of getLastName method, of class StudentDTO.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        StudentDTO instance = new StudentDTO();
        String expResult = "testing!";
        instance.setLastName("testing!");
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of setLastName method, of class StudentDTO.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        StudentDTO instance = new StudentDTO();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getFirstName method, of class StudentDTO.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        StudentDTO instance = new StudentDTO();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setFirstName method, of class StudentDTO.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        StudentDTO instance = new StudentDTO();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getEmail method, of class StudentDTO.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        StudentDTO instance = new StudentDTO();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setEmail method, of class StudentDTO.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        StudentDTO instance = new StudentDTO();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPhoneNumber method, of class StudentDTO.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        StudentDTO instance = new StudentDTO();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setPhoneNumber method, of class StudentDTO.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        StudentDTO instance = new StudentDTO();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
