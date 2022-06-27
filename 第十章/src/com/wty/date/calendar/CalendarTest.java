package com.wty.date.calendar;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author ty.wang
 * @since 2022/6/418:12
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
    //    常用方法
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.getActualMaximum(Calendar.DATE));
        System.out.println(calendar.getActualMinimum(Calendar.DATE));
        calendar.set(Calendar.YEAR,1990);
        calendar.set(Calendar.MONTH,3);
        calendar.set(Calendar.DATE,4);
        System.out.println(calendar);
        //String --->Calendar
        Date date = Date.valueOf("2020-4-5");
        calendar.setTime(date);
        System.out.println(calendar);
    }
}
