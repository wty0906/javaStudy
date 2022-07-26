package com.wty.jdk.inter;

import sun.applet.Main;

import java.util.Map;

/**
 * @author ty.wang
 * @since 2022/7/25 17:06
 */
public class Demo01Integerface {
    public static void main(String[] args) {
        A b = new B();
        A c = new C();
    }
}
interface A{
    void test1();
    //接口中新增抽象方法，所有实现类都需要重写这个方法，不利于接口的扩展
    void test2();
}
class B implements A{

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}
class C implements A{

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}
