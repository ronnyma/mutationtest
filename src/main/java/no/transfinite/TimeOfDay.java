package no.transfinite;

import org.joda.time.DateTime;


public class TimeOfDay {
    public static String getTimeOfDay(DateTime time)
    {
        if (time.getHourOfDay() >= 0 && time.getHourOfDay() < 6)
        {
            return "Night";
        }
        if (time.getHourOfDay() >= 6 && time.getHourOfDay() < 12)
        {
            return "Morning";
        }
        if (time.getHourOfDay() >= 12 && time.getHourOfDay() < 17)
        {
            return "Mid day";
        }
        if (time.getHourOfDay() >= 17 && time.getHourOfDay() < 22)
        {
            return "Afternoon";
        }
        return "Evening";
    }
}
