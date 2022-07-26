package com.wty.jdk.lambda.service;

/**
 * @author ty.wang
 * @since 2022/7/25 13:38
 * @FunctionAlInterface
 * 这是一个标志注解，被该注解修饰的接口只能声明一个抽象方法
 */
 @FunctionalInterface
public interface UserService {
    void show();
}
