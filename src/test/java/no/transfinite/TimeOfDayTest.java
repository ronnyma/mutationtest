package no.transfinite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.joda.time.DateTime;

import static org.junit.Assert.*;

public class TimeOfDayTest {
    @Before
    public void setUp() throws Exception {
        tod = new TimeOfDay();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getTimeOfDay1() throws Exception {
    //0 midnight to 6 am is night
        DateTime time = new DateTime(2017,9,8,0,0);

        assertEquals("Night", TimeOfDay.getTimeOfDay(time));


    }

    @Test
    public void getTimeOfDay2() throws Exception {
        //6 am to 12 pm is morning
        DateTime time = new DateTime(2017,9,8,7,0);

        assertEquals("Morning", TimeOfDay.getTimeOfDay(time));
    }

    @Test
    public void getTimeOfDay3() throws Exception {
        //12 pm to 17 pm is mid day
        DateTime time = new DateTime(2017,9,8,14,0);

        assertEquals("Mid day", TimeOfDay.getTimeOfDay(time));
    }
    @Test
    public void getTimeOfDay4() throws Exception {
        //17 pm to 22 pm is afternoon
        DateTime time = new DateTime(2017,9,8,19,0);

        assertEquals("Afternoon", TimeOfDay.getTimeOfDay(time));
    }
    @Test
    public void getTimeOfDay5() throws Exception {
        //After 22 to 00 am is evening
        DateTime time = new DateTime(2017,9,8,22,0);

        assertEquals("Evening", TimeOfDay.getTimeOfDay(time));
    }
    private TimeOfDay tod;
}
