package com.reflect._04_._02_获取方法和调用方法;

import com.reflect._04_.Student;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author ty.wang
 * @since 2022/11/1 22:20
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //获取字节码信息
        Class cls = Student.class;
        //获取方法
        //getMethods()获取运行时类的方法还有所有父类中的方法(被public修饰)
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("--------------------------------");
        //getDeclaredMethods() 获取运行时类中的所有方法：
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("--------------------------------");
        //获取指定的方法
        Method showInfo1 = cls.getMethod("showInfo");
        Method showInfo2 = cls.getMethod("showInfo", int.class);
        System.out.println(showInfo1);
        System.out.println("--------------------------------");
        System.out.println(showInfo2);
        System.out.println("--------------------------------");
        Method work = cls.getDeclaredMethod("work", int.class);
        System.out.println(work);
        System.out.println("--------------------------------");
        //获取方法的具体结构
        //获取方法名字
        System.out.println(work.getName());
        System.out.println("--------------------------------");
        //   获取修饰符
        int modifiers = work.getModifiers();
        System.out.println(Modifier.toString(modifiers));
        System.out.println("--------------------------------");
        //获取返回值
        System.out.println(work.getReturnType());
        //获取参数
        Class<?>[] parameterTypes = work.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        System.out.println("--------------------------------");
        //获取注解  getAnnotations()只能获取运行时的注解
        Method myMethod = cls.getMethod("myMethod");
        Annotation[] annotations = myMethod.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println("--------------------------------");
        //获取异常
        Class<?>[] exceptionTypes = myMethod.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }
        //调用方法
        Object obj = cls.newInstance();
        myMethod.invoke(obj);
        Object invoke = showInfo2.invoke(obj, 12);
        System.out.println(invoke);
    }

}
