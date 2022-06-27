package com.wty.date.calendar;


import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author ty.wang
 * @since 2022/6/418:21
 */
public class CalendarLianXi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期");
        String next = scanner.next();

        //Sting--->Calendar
        //1.String--->Date
        Date date = Date.valueOf(next);
        Calendar calendar = Calendar.getInstance();
        //2.Date--->Calendar:
        calendar.setTime(date);
        //星期提示
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //获取本月最大天数
        int maximum = calendar.getActualMaximum(Calendar.DATE);
        //获取当前日期
        int nowDay = calendar.get(Calendar.DATE);
        //将日期设置为每月的1号
        calendar.set(Calendar.DATE,1);
        //获取1号是本周的第几天
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        //循环打印1号前面的空格
        int day = dayOfWeek-1;
        for (int i = 0; i < day; i++) {
            System.out.print("\t");
        }

        int count = 0;
        count = count+day;
        for (int i = 1; i <= maximum; i++) {
            if (nowDay == i) {
                System.out.print(i + "*\t");
            } else {
                System.out.print(i + "\t");
            }
            count++;
            if (count % 7 == 0) {
                System.out.println();
            }

        }


    }
}
