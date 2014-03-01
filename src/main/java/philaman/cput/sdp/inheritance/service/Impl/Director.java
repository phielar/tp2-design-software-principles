/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp.inheritance.service.Impl;
import philaman.cput.sdp.inheritance.service.Employee;

/**
 *
 * @author student
 */
public class Director extends Employee{
    String degree;
    String officeExtention;
    String officeNo;

    public Director()
    { super();   }
    public Director(String firstName, String lastName, String speciality )
    {
        super(firstName,lastName, speciality );
    }
    public String getDirectorProffesion(String firstName, String lastName,String speciality )
    {        
        return String.format("%s %s is a new %s", super.getFirstName(),super.getLastName(), super.getSpeciality());
    }
    
}
