/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.lsp.violation.service;

/**
 *
 * @author phila
 */
public class Car {
     
    private String model;
    private String fuelOption;
    private String transmission;
    private double price;
    private double monthlyInstallmnts;
    private int cabinSpace;
    private String color;
    
    public double testdrivingDistance(double timeInMinutes, double speedKMH)
    { return timeInMinutes*speedKMH;        };
}
