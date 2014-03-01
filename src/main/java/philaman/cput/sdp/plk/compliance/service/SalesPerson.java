/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.plk.compliance.service;

/**
 *
 * @author phila
 */
public class SalesPerson {    
   
    String[] empNo={"1234", "1245", "1287", "1236", "1295"};
    int[] qsales={10, 15, 6, 14, 4};
    
    public int getQtrSales(String empNum) {
        int sales;
        if(empNo[0].equalsIgnoreCase(empNum))
            sales=qsales[0];
        else if(empNo[1].equalsIgnoreCase(empNum))
            sales=qsales[1];
        else if(empNo[2].equalsIgnoreCase(empNum))
            sales=qsales[2];
        else if(empNo[3].equalsIgnoreCase(empNum))
            sales=qsales[3];
        else
            sales=qsales[4];
        
        return sales;
    }
    
    
}
