/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.ocp.violation.service.Impl;

import philaman.cput.sdp.ocp.violation.service.CarService;

/**
 *
 * @author phila
 */
public class CarServiceFixempl extends CarService {

    public CarServiceFixempl() {
        super();
    }
     public String determineCarTopSpeedMessage(String carBrand, int doors, double price)
    {        
        return String.format("The %d doors %s Bakkie's top Speed is %s", doors,carBrand,super.determineCarTopSpeed(carBrand, price));
    }
    
}
