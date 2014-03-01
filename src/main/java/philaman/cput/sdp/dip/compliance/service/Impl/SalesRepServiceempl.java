/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp.dip.compliance.service.Impl;

import philaman.cput.sdp.dip.compliance.service.SalesRepService;

/**
 *
 * @author student
 */
public class SalesRepServiceempl implements  SalesRepService{
    public SalesRepServiceempl() {    }

    public double getCommAmount(double perc, double price) {
        return (perc > 0 || price > 60000)?price*(perc/100):0; //To change body of generated methods, choose Tools | Templates.
    }      
}
