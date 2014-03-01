/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp.ocp.compliance.service;

/**
 *
 * @author student
 */
public class CarService {
    String[] cCarType={"TOYOTA", "CHERVROLEY", "MITSUBISH", "TATA", "HONDA"};
    String[] cTopSpeed={"230km/h", "430km/h", "280km/h", "360km/h", "380km/h"};
    
    public String determineCarTopSpeed(String cBrandName) {
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
        
        return cTopSpeed[index];       
    }    
}
