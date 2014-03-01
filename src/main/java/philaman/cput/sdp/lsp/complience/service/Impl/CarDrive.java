/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.lsp.complience.service.Impl;

import philaman.cput.sdp.lsp.complience.service.Car;
import philaman.cput.sdp.lsp.complience.service.Sedan;

/**
 *
 * @author phila
 */
public class CarDrive extends Sedan implements Car{    
    
   
    @Override
    public String testdrivingDistance(double timeInMinutes, double speedKMH, String car)
    { return String.format("{Test Driving} Car Name: %s Distance Travelled: %.2fkm",car ,super.testDistance(timeInMinutes, speedKMH) );        };    

  
}
