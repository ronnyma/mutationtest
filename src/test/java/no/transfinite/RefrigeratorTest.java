package no.transfinite;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RefrigeratorTest {
    @Before
    public void setUp() {
        r = new Refrigerator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTemperature1() throws IllegalArgumentException {
        r.setTemperature(9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTemperature2() throws IllegalArgumentException {
        r.setTemperature(1);
    }

    @Test
    public void setTemperature3() {
        r.setTemperature(4);
        assertEquals(4, r.getTemperature());
    }

    @Test
    public void getTemperature() {
    }

    @Test
    public void calibrate() {
        assertTrue(r.calibrate());
    }

    private Refrigerator r;
}