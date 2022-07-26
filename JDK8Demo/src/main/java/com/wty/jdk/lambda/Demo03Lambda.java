package com.wty.jdk.lambda;

import com.wty.jdk.lambda.service.UserService;

/**
 * @author ty.wang
 * @since 2022/7/25 13:13
 */
public class Demo03Lambda {
    public static void main(String[] args) {
        goShow(new UserService() {
            @Override
            public void show() {
                System.out.println("show方法执行了");
            }
        });
        goShow(() -> {
            System.out.println("lambda show 方法执行了");
        });
    }

    public static void goShow(UserService service) {
        service.show();
    }
}
