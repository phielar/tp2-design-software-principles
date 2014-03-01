/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.ocp.violation.service;

/**
 *
 * @author phila
 */
public class CarService {
    String[] cCarType={"TOYOTA", "CHERVROLEY", "MITSUBISH", "TATA", "HONDA"};
    String[] cTopSpeed={"230km/h", "430km/h", "280km/h", "360km/h", "380km/h"};
    
    public String determineCarTopSpeed(String cBrandName, double price) {
        int index;
        if(cCarType[0].equalsIgnoreCase(cBrandName))
            index=0;
        else if(cCarType[1].equalsIgnoreCase(cBrandName))
            index=1;
        else if(cCarType[2].equalsIgnoreCase(cBrandName))
            index=2;
        else if(cCarType[3].equalsIgnoreCase(cBrandName))
            index=3;
        else 
            index=4;
        
        return String.format("%s and is Selling for R%.2f.",cTopSpeed[index], price) ;       
    }    
}
