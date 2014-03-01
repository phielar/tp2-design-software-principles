/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.isp.violation.service.Impl;

import philaman.cput.sdp.isp.violation.service.Person;

/**
 *
 * @author phila
 */
public class PersonServiceempl implements Person {
     @Override
    public int determineLeaveDays(int daysWorked) {
        int leav;
        if(daysWorked >= 500)
            leav=62;
        else if(daysWorked >= 360)
            leav=31;
        else if(daysWorked >= 120)
            leav=15;
        else
            leav=5;
        return leav;
        
    }   

    @Override
    public double quartersWorked(int daysWorked) {
       return ((daysWorked/4)<1?1:(daysWorked/4)); //To change body of generated methods, choose Tools | Templates.
    }
}
