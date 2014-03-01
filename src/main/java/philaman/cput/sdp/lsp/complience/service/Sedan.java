/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.lsp.complience.service;

/**
 *
 * @author phila
 */
public class Sedan implements Car{

    
    public double testDistance(double timeInMinutes, double speedKMH) 
    { return ((timeInMinutes/60)*speedKMH);      }; //To change body of generated methods, choose Tools | Templates.   

    @Override
    public String testdrivingDistance(double timeInMinutes, double speedKMH, String car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
