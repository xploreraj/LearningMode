package test;

import java.util.*;

/**
 * Created by rbiswas on 12/5/2014.
 */
public class DateUtility {
    public static Date truncateDate(Date date) {
        GregorianCalendar gc1 = new GregorianCalendar();
        gc1.clear();
        gc1.setTime(date);
        int year = gc1.get(Calendar.YEAR);
        int month = gc1.get(Calendar.MONTH);
        int day = gc1.get(Calendar.DAY_OF_MONTH);
        GregorianCalendar gc2 = new GregorianCalendar(year, month, day);
        return gc2.getTime();
    }

    public static final Date LATEST_DATE = truncateDate(new Date(0));

    public static void main(String[] args) {
        System.out.println("" + System.currentTimeMillis());
    }
}
