/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp.dip.violation.service;

/**
 *
 * @author student
 */
public class SalesRep {

    public double getCommAmount(double perc, double carPrice) {
         return (perc > 0 || carPrice > 60000)?carPrice*(perc/100):0; //To change body of generated methods, choose Tools | Templates.
    }
    
}
