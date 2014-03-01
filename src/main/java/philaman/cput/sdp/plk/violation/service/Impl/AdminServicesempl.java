/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.plk.violation.service.Impl;
import philaman.cput.sdp.plk.violation.service.Admin;
/**
 *
 * @author phila
 */
public class AdminServicesempl {
     private Admin secritary=new Admin();
    public String generateSaleReport(String empNo)    {           
        return String.format("Employee: %s Quarters Sales: %d", empNo, secritary.reps.getQtrSales(empNo) );
    }
}
