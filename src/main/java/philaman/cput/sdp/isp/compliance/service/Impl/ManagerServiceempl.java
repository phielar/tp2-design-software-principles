/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.isp.compliance.service.Impl;

import philaman.cput.sdp.isp.compliance.service.Manager;

/**
 *
 * @author phila
 */
public class ManagerServiceempl implements Manager {

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
   
}
