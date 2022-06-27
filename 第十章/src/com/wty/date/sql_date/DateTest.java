package com.wty.date.sql_date;

import javax.tools.JavaCompiler;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ty.wang
 * @since 2022/6/417:25
 */
public class DateTest {
    public static void main(String[] args) {
        /*Date date = new Date(1654334453678L);

        System.out.println(date);
        *//*
        (1)java.sql.Date和java.util.Date的区别：
        java.util.Date：年月日  时分秒
        java.sql.Date：年月日
        (2)java.sql.Date和java.util.Date的联系：
        java.sql.Date(子类) extends java.util.Date （父类）
        *//*
        //java.sql.Date和java.util.Date相互转换：
        //【1】util--->sql:
        java.util.Date date1 = new java.sql.Date(1654334453678L);
        //方式1：向下转型
        Date date2 = (Date) date1;

        //方式2：利用构造器
        Date date3 = new Date(date1.getTime());
        //【2】sql-->util:
        java.util.Date date4 = date;

        //[3]String--->sql.Date:
        Date date5 = Date.valueOf("2022-6-4");*/
    }
}
