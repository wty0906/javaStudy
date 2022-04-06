package com.dierzhang;

import java.util.Scanner;

/**
 * @author ty.wang
 * @since 2022/4/622:20
 */
public class UseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] s = next.split("_");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("1")){
                s[i] = "男";
            }else if(s[i].equals("2")){
                s[i]= "女";
            }
            System.out.println(s[i]);
        }
    }
}
