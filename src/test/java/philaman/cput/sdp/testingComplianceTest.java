/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import philaman.cput.sdp.config.AppConfig;
import philaman.cput.sdp.dip.compliance.service.Impl.SalesRepServiceempl;
import philaman.cput.sdp.dip.compliance.service.SalesRepService;
import philaman.cput.sdp.ocp.compliance.service.Impl.CarServiceempl;
import philaman.cput.sdp.lsp.complience.service.Car;
import philaman.cput.sdp.lsp.complience.service.Impl.CarDrive;
import philaman.cput.sdp.srp.compliance.service.Driver;
import philaman.cput.sdp.plk.compliance.service.Impl.ReportServicesempl;
import philaman.cput.sdp.isp.compliance.service.Manager;
import philaman.cput.sdp.isp.compliance.service.Impl.ManagerServiceempl;
/**
 *
 * @author student
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({})
public class testingComplianceTest {
    private static SalesRepService sale;
    private static ApplicationContext axt=new AnnotationConfigApplicationContext(AppConfig.class); 
    private static CarServiceempl cars;
    private static Car soldCars;
    private static Driver drive;
    @Test
    public void dipTestSaleRepCommision()
    {
        sale=(SalesRepServiceempl) axt.getBean("sale");                
        double comm=sale.getCommAmount(10, 300000);
        System.out.print("Price: "+comm);
        assertEquals(comm, 30000, 0.0);
        
    }
    @Test
    public void testDetermineCarTopSpeedMessage()
    {
        cars=(CarServiceempl)axt.getBean("ocp");
        String spd=cars.determineCarTopSpeedMessage("TOYOTA", 2);
        assertEquals(spd, "The 2 doors TOYOTA Bakkie's top Speed is 230km/h.");
    }
    @Test
    public void testTestDrivingDistnce()
    {
        soldCars=(CarDrive)axt.getBean("lsp");       
        String testdrver=soldCars.testdrivingDistance(30, 20,"Toyota Hilux");
        Assert.assertEquals(testdrver, "{Test Driving} Car Name: Toyota Hilux Distance Travelled: 10.00km");
    }
   
    /*whenever the cars are take out for display they must come back after a certain time
     * back inside the store and this method determines the return time for the car.
     */
     @Test
    public void testDriverRoles()
    {
        drive=(Driver)axt.getBean("srpCompliance");
        String carTimeIn=drive.determineTimeIn( 9, 30, 0);
        Assert.assertEquals(carTimeIn, "IN Time: 16:30:0." );
        
    }
    @Test
    public void testPlk()
    {
        ReportServicesempl rep=(ReportServicesempl)axt.getBean("plkCompiance");
         String report=rep.generateSaleReport("1287");
        Assert.assertEquals(report, "Employee: 1287 Quarters Sales: 6");
        
    }
    @Test
    public void testISP()
    {
        Manager man=(Manager)axt.getBean("ispC");
        int leavDaysAvail=man.determineLeaveDays(200);
        Assert.assertEquals(leavDaysAvail, 15);
    }
    @BeforeClass
    public static void sentUpClass() throws Exception {                
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
