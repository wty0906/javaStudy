package com.wty.date.dateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author ty.wang
 * @since 2022/6/2717:02
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //格式化类：DateTimeFormatter

        //方式一：预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();
        //LocalDateTime-->String
        String format = localDateTimeFormatter.format(now);
        System.out.println(format);
        //String-->localDateTime
        TemporalAccessor parse = localDateTimeFormatter.parse(format);
        System.out.println(parse);
        //localDateTimeFormatter
        //方式二：本地化相关的格式。如：oflocalizedDateTime()
        //参数：FormatStyLe.LONG / FormatstyLe.MEDIUM / FormatstyLe.SHORT
        //FormatstyLe.L0NG:2022年6月27日 下午05时16分24秒
        //Formatstyle.MEDIUM:2020-6-15 15:17:42
        //FormatstyLe.SH0RT:20-6-15下午3：18
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //LocalDateTime-->String
        String format1 = dateTimeFormatter.format(now);
        System.out.println(format1);
        //String-->localDateTime
        TemporalAccessor parse1 = dateTimeFormatter.parse("2022年6月27日 下午05时16分24秒");
        System.out.println(parse1);
        //方式三：自定义的格式。如：ofPattern("yyyy-MM-ddhh:mm:ss")--》重点，以后常用
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format2 = dateTimeFormatter1.format(now);
        System.out.println(format2);
        TemporalAccessor parse2 = dateTimeFormatter1.parse("2022-06-27 05:18:12");
        System.out.println(parse2);
    }
}
