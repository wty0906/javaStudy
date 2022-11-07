package com.reflect._04_._02_获取属性和对属性进行赋值;

import com.reflect._04_.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author ty.wang
 * @since 2022/11/7 20:45
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //获取运行时类的字节码信息；
        Class cls = Student.class;
        //获取属性：
        Field[] fields = cls.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("------");
        //getDeclaredFields: 获取运行是类中的所有属性
        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("---------");
        //获取指定属性
        Field score = cls.getField("score");
        System.out.println(score);
        Field sno = cls.getDeclaredField("sno");
        System.out.println(sno);
        System.out.println("------------");
        //属性的具体结构
        //获取修饰符
        /*
        * int modifiers = sno.getModifiers();
        * System.out.println(modifiers);
        * System.out.println(Modifier.toString(modifiers));
        * */
        System.out.println(Modifier.toString(sno.getModifiers()));
        System.out.println("------------");
        //获取属性的数据类型
        Class type = sno.getType();
        System.out.println(type.getName());
        System.out.println("------------");
        //获取属性的名字
        String name = sno.getName();
        System.out.println(name);
        System.out.println("--------------");
        //给属性赋值：（给属性设置值，必须要有对象）
        Field sco = cls.getField("score");
        Object o = cls.newInstance();
        //给o这个对象的score属性设置具体的值，这个值为98
        sco.set(o,98);
        System.out.println(o);


    }
}
