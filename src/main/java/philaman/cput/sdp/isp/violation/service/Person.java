/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.isp.violation.service;

/**
 *
 * @author phila
 */
public interface Person {
    
     abstract int determineLeaveDays(int Days);
     abstract double quartersWorked(int daysWorked);
}
