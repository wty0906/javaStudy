package com.reflect._02_获取字节码信息的方式;

import com.reflect._04_.Person;

/**
 * @author ty.wang
 * @since 2022/10/30 22:09
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //案例：以person的字节码信息为案例
        //方式1 通过getClass()方法进行获取
        Person person = new Person();
        Class c1 = person.getClass();
        System.out.println(c1);
        //方式2 通过内置class属性  方式一和方式二不常用
        Class c2 = Person.class;
        System.out.println(c2);
        System.out.println(c2==c1);
        //方式3(用的最多) 调用Class类提供的静态方法forName() 
        Class<?> c3 = Class.forName("com.reflect._04_.Person");
        System.out.println(c3==c2);
        //方式4(了解) 利用类的加载器
        ClassLoader classLoader = Test.class.getClassLoader();
        Class c4 = classLoader.loadClass("com.reflect._04_.Person");
        System.out.println(c3==c4);

    }
}
