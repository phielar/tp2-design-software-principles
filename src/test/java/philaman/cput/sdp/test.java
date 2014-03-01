/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.sdp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import philaman.cput.sdp.config.AppConfig;
import philaman.cput.sdp.encapsulation.service.Impl.SalesRepCommisionServiceempl;
import philaman.cput.sdp.inheritance.service.Impl.Director;
import philaman.cput.sdp.polymorphism.service.Bakkie;
import philaman.cput.sdp.polymorphism.service.Car;

/**
 *
 * @author phila
 */
public class test {
    
    public test() {
    }
      private ApplicationContext axct =new AnnotationConfigApplicationContext(AppConfig.class);;
    private Director emp;
    private SalesRepCommisionServiceempl serv;
    private Car cars;
    @Test
    public void addDirectorTest()
    {
        emp=(Director)axct.getBean("inheritance");        
        String dir=emp.getDirectorProffesion("Lima", "Monali", "Managing_Director");        
        Assert.assertEquals(dir, dir);
    }
    @Test
    public void testCommisionAmount()
    {
        serv=(SalesRepCommisionServiceempl)axct.getBean("encapsulation");
        double comm=serv.getCommission(200000.00);
        Assert.assertEquals(comm, 30000.0, 0.00001);
    }
    @Test
    public  void equalstest()
    {
        cars=(Car)axct.getBean("polymorphism");   
        Car bakkie1=new Bakkie();
        cars=bakkie1;
        Assert.assertNotNull(cars);
                      
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}