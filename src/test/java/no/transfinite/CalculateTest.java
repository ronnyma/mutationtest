package no.transfinite;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by ronnyma on 05/02/2017.
 */
public class CalculateTest {
    @org.junit.Before
    public void setUp() throws Exception {
        cl = new Calculate();
    }


    @org.junit.Test
    public void add() throws Exception {
        assertEquals(16, cl.add(7, 9));
    }

    @org.junit.Test
    public void subtract() throws Exception {
        assertEquals(7, cl.subtract(18, 11));
    }

    @org.junit.Test
    public void aIsGreaterThanb() throws Exception {
        assertTrue(true);
    }

    @org.junit.Test
    public void min() throws Exception {
        assertEquals(5, cl.min(5,6));
    }
    
    Calculate cl;
}

