/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.srp.compliance.service.Impl;

import philaman.cput.sdp.srp.compliance.service.Driver;

/**
 *
 * @author phila
 */

public class Driverempl implements Driver{
   
    @Override
    public String determineTimeIn(int outHr, int OutMin, int outSec) {
        int num;
        if(outHr >= 10)
            num=6;
        else if(outHr >= 9)
            num=7;
        else if(outHr >= 8)
            num=8;
        else
            num=9;       
            
        return String.format("IN Time: %d:%d:%d.", (outHr+num),OutMin, outSec); //To change body of generated methods, choose Tools | Templates.
    }
}
