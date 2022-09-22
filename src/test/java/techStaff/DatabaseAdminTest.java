package techStaff;

import Management.Manager;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest{


    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Alex", 34334, 30000);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(6000);
        assertEquals(36000, databaseAdmin.getSalary(), 0.0 );
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, databaseAdmin.payBonus(), 0.0);
    }


}