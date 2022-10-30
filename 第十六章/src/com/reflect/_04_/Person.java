package com.reflect._04_;

import java.io.Serializable;

/**
 * @author ty.wang
 * @since 2022/10/30 22:01
 */
public class Person implements Serializable {
    private int age;
    public String name;

    private void eat() {
        System.out.println("Person------------------------eat----------------");
    }

    public void sleep() {
        System.out.println("Person------------------------sleep----------------");
    }
}
