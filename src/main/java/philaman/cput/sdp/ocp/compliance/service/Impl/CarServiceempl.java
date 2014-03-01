/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp.ocp.compliance.service.Impl;

import philaman.cput.sdp.ocp.compliance.service.CarService;

/**
 *
 * @author student
 */
public class CarServiceempl extends CarService {

    public CarServiceempl() {
        super();
    }
     public String determineCarTopSpeedMessage(String carBrand, int doors)
    {
        return String.format("The %d doors %s Bakkie's top Speed is %s.", doors,carBrand,super.determineCarTopSpeed(carBrand));
    }
    
}
