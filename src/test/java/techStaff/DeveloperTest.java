package techStaff;

import Management.Manager;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Richard", 23233, 27000);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(6000);
        assertEquals(33000, developer.getSalary(), 0.0 );
    }

    @Test
    public void canPayBonus(){
        assertEquals(270.00, developer.payBonus(), 0.0);
    }

}