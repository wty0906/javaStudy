package com.wty.jdk.lambda;

import com.wty.jdk.lambda.pojo.Person;
import com.wty.jdk.lambda.service.OrderService;
import com.wty.jdk.lambda.service.StudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author ty.wang
 * @since 2022/7/25 13:13
 */

public class Demo05Lambda {
    public static void main(String[] args) {
        goStudent((String name, Integer age) -> {
            return name + age + " 666...";
        });
        System.out.println(".........");
        //省略写法
        goStudent((name, age) -> name + age + " 省略6666...");
        System.out.println("--------------------");
        goOrder((String name) -> {
            System.out.println(name);
            return 666;
        });
        System.out.println(".........");
        //省略写法
        goOrder(name -> {
            System.out.println(name);
            return 666;
        });
    }

    public static void goStudent(StudentService studentService) {
        String show = studentService.show("张三", 22);
        System.out.println(show);
    }

    public static void goOrder(OrderService orderService) {
        orderService.show("李四");
    }
}
