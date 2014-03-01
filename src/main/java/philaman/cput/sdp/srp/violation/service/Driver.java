/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp.srp.violation.service;

/**
 *
 * @author phila
 */
public interface Driver {
  abstract String determineTimeIn(int outHr, int OutMin, int outSec);
  abstract double weeklySal(double hrRate, double hrsWorked);
}
