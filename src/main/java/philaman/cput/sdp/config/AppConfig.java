/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp.config;
import org.springframework.context.annotation.Bean;
import philaman.cput.sdp.lsp.complience.service.Impl.CarDrive;
import philaman.cput.sdp.dip.compliance.service.Impl.SalesRepServiceempl;
import philaman.cput.sdp.dip.violation.service.Impl.SalesRepServiceVempl;
import philaman.cput.sdp.inheritance.service.Employee;
import philaman.cput.sdp.inheritance.service.Impl.Director;
import philaman.cput.sdp.ocp.compliance.service.CarService;
import philaman.cput.sdp.ocp.compliance.service.Impl.CarServiceempl;
import philaman.cput.sdp.encapsulation.service.Impl.SalesRepCommisionServiceempl;
import philaman.cput.sdp.polymorphism.service.Impl.BakkieServicempl;
import philaman.cput.sdp.ocp.violation.service.Impl.CarServiceFixempl;
import philaman.cput.sdp.lsp.violation.service.Impl.CarTestDrive;
import philaman.cput.sdp.srp.compliance.service.Impl.Driverempl;
import philaman.cput.sdp.srp.violation.service.Impl.DriverVempl;
import philaman.cput.sdp.plk.compliance.service.Impl.ReportServicesempl;
import philaman.cput.sdp.plk.violation.service.Impl.AdminServicesempl;
import philaman.cput.sdp.isp.compliance.service.Manager;
import philaman.cput.sdp.isp.compliance.service.Impl.ManagerServiceempl;
import philaman.cput.sdp.isp.violation.service.Person;
import philaman.cput.sdp.isp.violation.service.Impl.PersonServiceempl;
/**
 *
 * @author student
 */
//@Configuration
public class AppConfig {
    @Bean(name="ispC")
    public Manager getManager()
    {
        return new ManagerServiceempl();
    }
    @Bean(name="ispV")
    public Person getPerson()
    {
        return new PersonServiceempl();
    }
    @Bean(name="plkCompiance")
    public ReportServicesempl getReportService()
    {
        return new ReportServicesempl();
    }    
    @Bean(name="plkViolation")
    public AdminServicesempl getReportService1()
    {
        return new AdminServicesempl();
    }    
    @Bean(name="lspViolation")
    public CarTestDrive getTestDrive()
    {   return new CarTestDrive(); 
    }
    @Bean(name="sale")
    public SalesRepServiceempl getSalesRepServisev()
    {   return new SalesRepServiceempl();
    }    
    @Bean(name="dip")
    public SalesRepServiceVempl getSalesRepServise1()
    {   return new SalesRepServiceVempl();
    }    
    @Bean(name="ocp")
    public CarService getCarService()
    {
        return new CarServiceempl();
    }
    @Bean(name="ocp1")
    public CarServiceFixempl getCarService2()
    {
        return new CarServiceFixempl();
    }
    @Bean(name="polymorphism")
    public BakkieServicempl getCar()
    {
        return new BakkieServicempl();
    }    
    @Bean(name="inheritance")
    public Employee getEmployee()
    {
        return new Director();
    }
    @Bean(name="encapsulation")
    public SalesRepCommisionServiceempl getSalesRepComServise()
    {   return new SalesRepCommisionServiceempl();
    }
    @Bean(name="lsp")
    public CarDrive getCarDrive()
    {
        return new CarDrive();
    }
    @Bean(name="srpCompliance")
    public Driverempl getDriverRoles()
    {   return new Driverempl();
    }
    @Bean(name="srpViolation")
    public DriverVempl getDriverRoless()
    {   return new DriverVempl();
    }
 }
    

