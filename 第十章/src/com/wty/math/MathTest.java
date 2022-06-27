package com.wty.math;
//静态导入

import static java.lang.Math.*;

/**
 * @author ty.wang
 * @since 2022/6/2722:57
 */

public class MathTest {
    public static void main(String[] args) {
        //不用静态导入
        System.out.println(Math.PI);
        System.out.println("--------------");
        System.out.println("随机数：" + Math.random());
        int abs = Math.abs(-80);
        System.out.println("绝对值：" + abs);
        System.out.println("--------------");
        System.out.println("向上取值：" + Math.ceil(9.1));
        System.out.println("向下取值：" + Math.floor(9.1));
        System.out.println("--------------");
        System.out.println("四舍五入：" + Math.round(3.4));
        System.out.println("四舍五入：" + Math.round(3.5));
        System.out.println("--------------");
        System.out.println("取最大值：" + Math.max(3, 6));
        System.out.println("取最小值：" + Math.min(3, 6));
        System.out.println("************");
        //静态导入
        System.out.println("静态导入写法");
        System.out.println("************");

        System.out.println(PI);
        System.out.println("--------------");
        System.out.println("随机数：" + random());
        int abs1 = abs(-80);
        System.out.println("绝对值：" + abs1);
        System.out.println("--------------");
        System.out.println("向上取值：" + ceil(9.1));
        System.out.println("向下取值：" + floor(9.1));
        System.out.println("--------------");
        System.out.println("四舍五入：" + round(3.4));
        System.out.println("四舍五入：" + round(3.5));
        System.out.println("--------------");
        System.out.println("取最大值：" + max(3, 6));
        System.out.println("取最小值：" + min(3, 6));
    }
    //如果跟Math中方法重复了，那么会优先走本类中的方法)
    public static int random() {
        return 100;
    }
}
