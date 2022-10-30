package com.reflect._01_.用反射;

import com.reflect._01_.没用反射.Mtwm;

import java.lang.reflect.Method;

/**
 * @author ty.wang
 * @since 2022/10/18 23:01
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        String str = "com.reflect._01_.没用反射.BankCard";
        Class<Mtwm> c = (Class<Mtwm>) Class.forName(str);
        Mtwm mtwm = c.newInstance();
        mtwm.payOnline();
    }
}