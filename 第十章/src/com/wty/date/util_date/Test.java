package com.wty.date.util_date;

import java.util.Date;

/**
 * @author ty.wang
 * @since 2022/6/417:14
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());
        System.out.println(date.getYear()+1900);
        System.out.println(date.getMonth());
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        /*
        （1）疑问：以后获取时间差用：getTime()还是currentTimeMillis()
        答案：currentTimeMillis()--》因为这个方法是静态的，可以类名.方法名直接调用
        （2）public static native long currentTimeMillis();
        本地方法
        为什么没有方法体？因为这个方法的具体实现不是通过java写的。
        （3）这个方法的作用：
        一般会去衡量一些算法所用的时间
        * */
    }
}
