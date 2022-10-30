package com.reflect._03_Class类的实例的种类;

import com.reflect._04_.Person;

/**
 * @author ty.wang
 * @since 2022/10/30 22:23
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * Class类的具体的实例的种类有：
         * 1.类：内部类和外部类
         * 2.接口
         * 3.注解
         * 4.数组
         * 5.基本数据类型
         * 6.void
         */
        //1.类
        Class c1 = Person.class;
        //2.接口
        Class c2 = Comparable.class;
        //3.注解
        Class c3 = Override.class;
        //4.数组
        int[] arr1 = {1, 2, 3};
        Class c4 = arr1.getClass();
        int[] arr2 = {4, 5, 6};
        Class c5 = arr2.getClass();
        //同一个维度，同一个元素类型，得到的字节码就是同一个
        System.out.println(c5==c4);//结果为true
        //5.基本数据类型
        Class c6 = int.class;
        //6.void
        Class c7= void.class;



    }
}
