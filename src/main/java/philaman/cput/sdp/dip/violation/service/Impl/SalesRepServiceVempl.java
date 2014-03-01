/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp.dip.violation.service.Impl;

import philaman.cput.sdp.dip.violation.service.SalesRep;

/**
 *
 * @author student
 */
public class SalesRepServiceVempl extends SalesRep{

        public double getComm(double perc, double carPrice)
    {
        /*checks if car price is above R200 000.00 and gives the rep 1% 
        of the price plus the commition normal rate.
        */       
        double NormComm=super.getCommAmount(perc, carPrice);
        double onePercBonus=(carPrice <200000)?carPrice*0.01: 0;         
        return (onePercBonus+NormComm);
    }
}
