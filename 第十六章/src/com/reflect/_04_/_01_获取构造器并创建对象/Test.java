package com.reflect._04_._01_获取构造器并创建对象;

import com.reflect._04_.Student;

import java.lang.reflect.Constructor;

/**
 * @author ty.wang
 * @since 2022/10/30 22:45
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //获取字节码信息
        Class cls = Student.class;
        /*
        * 通过字节码信息可以获取构造器
        * getConstructors()只能获取当前运行时类的被public修饰的构造器
        * */
        Constructor[] c1 = cls.getConstructors();
        for (Constructor constructor : c1) {
            System.out.println(constructor);
        }
        System.out.println("--------------------------------");
        //getDeclaredConstructors()能狗获取运行时类的全部修饰符的构造器
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("--------------------------------");
        //获取指定构造器
        // getConstructor()不传参数则获取的是空参构造器
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);
        System.out.println("--------------------------------");
        // 得到两个参数的有参构造器
        Constructor constructor1 = cls.getConstructor(double.class, double.class);
        System.out.println(constructor1);
        System.out.println("--------------------------------");
        //得到一个参数的有参构造器 并且修饰符是 private
        Constructor declaredConstructor = cls.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor);
        System.out.println("--------------------------------");
        //有了构造器就可以创建对象了
        Object o = constructor.newInstance();
        System.out.println(o);
        Object o1 = constructor1.newInstance(180.0, 167.5);
        System.out.println(o1);
    }
}
