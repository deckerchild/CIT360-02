/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;


import java.io.Serializable;
/**
 *
 * @author mount
 */
public class StudentBean implements Serializable{
    
    private String firstName;        //student first name
    private String lastName;         //student last name
    private int studentStartYear;    //student year
    private int studentBirthYear;    //student birth year
    private int studentGPA;          //student GPA
 
    public StudentBean()
    {
        
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the studentStartYear
     */
    public int getStudentStartYear() {
        return studentStartYear;
    }

    /**
     * @param studentStartYear the studentStartYear to set
     */
    public void setStudentStartYear(int studentStartYear) {
        this.studentStartYear = studentStartYear;
    }

    /**
     * @return the studentBirthYear
     */
    public int getStudentBirthYear() {
        return studentBirthYear;
    }

    /**
     * @param studentBirthYear the studentBirthYear to set
     */
    public void setStudentBirthYear(int studentBirthYear) {
        this.studentBirthYear = studentBirthYear;
    }

    /**
     * @return the studentGPA
     */
    public int getStudentGPA() {
        return studentGPA;
    }

    /**
     * @param studentGPA the studentGPA to set
     */
    public void setStudentGPA(int studentGPA) {
        this.studentGPA = studentGPA;
    }
    
}
