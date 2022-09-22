package Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Steve", 232323, 30000, "Front End");
    }


    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(6000);
        assertEquals(36000, manager.getSalary(), 0.0 );
    }

    @Test
    public void canPayBonus(){
    assertEquals(300.00, manager.payBonus(), 0.0);
    }


}