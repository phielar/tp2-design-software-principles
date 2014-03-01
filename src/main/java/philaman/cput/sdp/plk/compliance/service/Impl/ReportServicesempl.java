/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.plk.compliance.service.Impl;
import philaman.cput.sdp.plk.compliance.service.Admin;
import philaman.cput.sdp.plk.compliance.service.SalesPerson;
/**
 *
 * @author phila
 */
public class ReportServicesempl {
    private Admin secritary=new Admin();
    private SalesPerson salesman=new SalesPerson();
    public String generateSaleReport(String empNo)    {           
        return String.format("Employee: %s Quarters Sales: %d", empNo, salesman.getQtrSales(empNo) );
    }
    
}
