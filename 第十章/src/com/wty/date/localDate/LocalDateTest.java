package com.wty.date.localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author ty.wang
 * @since 2022/6/2716:33
 */
public class LocalDateTest {
    public static void main(String[] args) {
        //方法1 now()：获取当前的日期，时间，日期+时间
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("-------------------");
        //方法2 of():--设置指定的日期，时间，日期+时间
        LocalDateTime localDateTimeOf = LocalDateTime.of(1890, 12, 23, 12, 24, 15);
        System.out.println(localDateTimeOf);
        LocalDate localDateOf = LocalDate.of(1890, 12, 12);
        System.out.println(localDateOf);
        LocalTime localTimeOf = LocalTime.of(6,27,15);
        System.out.println(localTimeOf);
        System.out.println("-------------------");
        //常用的get***方法
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println("-------------------");
        //设置日期时间的方法 用with
        LocalDateTime withYear = localDateTime.withYear(2020);
        LocalDateTime withMonth = localDateTime.withMonth(1);
        LocalDateTime withDayOfMonth = localDateTime.withDayOfMonth(2);
        LocalDateTime withHour = localDateTime.withHour(3);
        LocalDateTime withMinute = localDateTime.withMinute(4);
        LocalDateTime withSecond = localDateTime.withSecond(5);
        System.out.println(withYear);
        System.out.println(withMonth);
        System.out.println(withDayOfMonth);
        System.out.println(withHour);
        System.out.println(withMinute);
        System.out.println(withSecond);
        System.out.println("-------------------");
        //提供了加减操作
        //加
        LocalDateTime plusMonths = localDateTime.plusMonths(7);
        System.out.println(plusMonths);
        //减
        LocalDateTime minusHours = localDateTime.minusHours(17);
        System.out.println(minusHours);
    }
}
