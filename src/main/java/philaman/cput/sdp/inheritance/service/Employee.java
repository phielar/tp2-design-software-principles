/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp.inheritance.service;

/**
 *
 * @author student
 */
public class Employee {
    private int emp_no;
    private String firstName;
    private String lastName;
    private String street_no;
    private String street;
    private String postalCode;    
    private String speciality;
    private String HomePhone;

    public Employee() {
    }
    public Employee(String firstName, String lastName, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSpeciality() {
        return speciality;
    }
}
