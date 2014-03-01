/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.encapsulation.service.Impl;
import philaman.cput.sdp.encapsulation.service.SalesRepCommisionService;
/**
 *
 * @author phila
 */
public class SalesRepCommisionServiceempl extends SalesRepCommisionService {
    
    public double getCommission(double carPrice)
    {   return (carPrice <=0)?-999999:carPrice*super.getCommRate();   }
}
