package com.wty.jdk.inter;

/**
 * @author ty.wang
 * @since 2022/7/25 17:06
 */
public class Demo02Integerface {
    public static void main(String[] args) {
        D e = new E();
        D f = new F();
        e.test3();
        f.test3();
        D.test4();

    }
}

interface D {
    void test1();

    //接口中新增抽象方法，所有实现类都需要重写这个方法，不利于接口的扩展
    void test2();

    /**
     * 接口中定义的默认方法
     */
    default String test3() {
        System.out.println("接口中的默认方法执行了...");
        return "hello";
    }

    /**
     * 接口中的静态方法
     */
    static String test4() {
        System.out.println("接口中的静态方法..");
        return "hello";
    }
}

class E implements D {

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }

    @Override
    public String test3() {
        System.out.println("重写test3");
        return "ok...";
    }
}

class F implements D {

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}
