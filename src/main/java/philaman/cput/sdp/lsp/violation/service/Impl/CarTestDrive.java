/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.lsp.violation.service.Impl;

import philaman.cput.sdp.lsp.violation.service.Car;

/**
 *
 * @author phila
 */
public class CarTestDrive extends Car{
    
    @Override
    public double testdrivingDistance(double timeInMinutes, double speedKMH)
    { return timeInMinutes*speedKMH;        };
    
}
