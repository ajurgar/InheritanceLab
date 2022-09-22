package Management;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Will", 232323, 100000, "IT", 1000000);
    }

    @Test
    public void getBudget(){
        assertEquals(1000000, director.getBudget(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000, director.payBonus(), 0.0);
    }



}


