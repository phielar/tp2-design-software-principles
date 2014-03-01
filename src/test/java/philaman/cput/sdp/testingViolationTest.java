/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.sdp;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;
import philaman.cput.sdp.config.AppConfig;
import philaman.cput.sdp.dip.violation.service.Impl.SalesRepServiceVempl;
import philaman.cput.sdp.lsp.violation.service.Car;
import philaman.cput.sdp.lsp.violation.service.Impl.CarTestDrive;
import philaman.cput.sdp.lsp.violation.service.Bakkie;
import java.util.*;
import philaman.cput.sdp.ocp.violation.service.Impl.CarServiceFixempl;
import philaman.cput.sdp.srp.violation.service.Driver;
import philaman.cput.sdp.plk.violation.service.Impl.AdminServicesempl;
import philaman.cput.sdp.isp.violation.service.Person;
import philaman.cput.sdp.isp.violation.service.Impl.PersonServiceempl;
/**
 *
 * @author student
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({philaman.cput.sdp.testingComplianceTest.class})
public class testingViolationTest {
    
    private static ApplicationContext acxt=new AnnotationConfigApplicationContext(AppConfig.class);
    private static CarServiceFixempl cars;
    private static SalesRepServiceVempl sale;
    private static CarTestDrive test;
    private static List<CarTestDrive> testdr= new ArrayList<>();
    private static Driver drive;
    @Test
    public void dipCalcSaleCommintion()
    {
        sale=(SalesRepServiceVempl)acxt.getBean("dip");
        double num=sale.getCommAmount(10.0, 300000.0);
        Assert.assertEquals(num, 30000, 0.00001);
    }
    @Test
    public void topSpeedReportMessage()
    {
        cars=(CarServiceFixempl)acxt.getBean("ocp1");
        String report=cars.determineCarTopSpeedMessage("TOYOTA", 4, 320000.00); 
        Assert.assertEquals(report, "The 4 doors TOYOTA Bakkie's top Speed is 230km/h and is Selling for R320000.00.");
        
    }
    @Test(expectedExceptions={ClassCastException.class})
    public void testTestDrice()
    {
       test=(CarTestDrive)acxt.getBean("lspViolation");
       Car car1=new Car();
       Car toyota=new Bakkie();       
       testdr.add((CarTestDrive)(Car) car1);
       testdr.add(test);
       testdr.add((CarTestDrive)(Car)toyota);
       double sedan=testdr.get(0).testdrivingDistance(30, 80);
       double bakkie=testdr.get(2).testdrivingDistance(30, 80);
       Assert.assertSame(sedan, bakkie);           
    }
    
    @Test
    public void testDriverRoles()
    {
        drive=(Driver)acxt.getBean("srpViolation");
        String carTimeIn=drive.determineTimeIn( 8, 50, 0);
        double driveWages=drive.weeklySal(30, 40);
        Assert.assertEquals(carTimeIn, "IN Time: 16:50:0." );
        Assert.assertEquals(driveWages, 1200.0, 0.00001);        
    }
    @Test
    public void testPLk()
    {
        AdminServicesempl sales=(AdminServicesempl)acxt.getBean("plkViolation");
        String salesRep=sales.generateSaleReport("1295");
        Assert.assertEquals(salesRep, "Employee: 1295 Quarters Sales: 4");
        
    }
    @Test
    public void testPersonLeavDays()
    {
        Person worker=(Person)acxt.getBean("ispV");
        int leavDays=worker.determineLeaveDays(500);
        int quartersWorked=worker.determineLeaveDays(20);
        Assert.assertEquals(leavDays, 62);
                
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
