package com.wty.jdk.fun;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

import java.util.function.Predicate;

/**
 * @author ty.wang
 * @since 2022/7/26 12:07
 */
public class PredicateDefaultTest {
    public static void main(String[] args) {
        test(s -> {
            return s.contains("H");
        },s2 -> {
            return s2.contains("W");
        });
    }

    public static void test(Predicate<String> p1, Predicate<String> p2) {
        //b1包含h b2包含w
        //p1包含H 同时p2包含w
        boolean b = p1.and(p2).test("Hello");
        //p1包含H 或者p2包含w
        boolean b1 = p1.or(p2).test("Hello");
        //p1不包含H
        boolean b2 = p1.negate().test("Hello");
        System.out.println(" b :"+b); //false
        System.out.println(" b1 :"+b1);//true
        System.out.println(" b2 :"+b2);//false
    }
}
