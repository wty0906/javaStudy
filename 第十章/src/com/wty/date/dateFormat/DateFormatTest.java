package com.wty.date.dateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ty.wang
 * @since 2022/6/418:12
 */
public class DateFormatTest {
    public static void main(String[] args) {
        //有局限性，字符串的格式只能是年-月-日拼接的形式，换成其它类型，就会出现异常
       /* Date date = Date.valueOf("2022-6-4");
        java.util.Date date1 = date;
        System.out.println(date1.toString());*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date parse = simpleDateFormat.parse("2022-6-4 18:09:00");
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }
}
