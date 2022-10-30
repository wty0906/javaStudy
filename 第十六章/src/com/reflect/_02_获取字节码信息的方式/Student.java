package com.reflect._02_获取字节码信息的方式;

/**
 * @author ty.wang
 * @since 2022/10/30 22:03
 */
public class Student extends Person {
    //属性
    private int sno;
    double height;
    protected double weight;
    public double score;
    //构造器

    public Student() {
    }

    private Student(int sno) {
        this.sno = sno;
    }

    Student(int sno, double weight) {
        this.sno = sno;
        this.weight = weight;
    }

    //方法
    public String showInfo(){
        return "我是一名三好学生";
    }
    public void work(){
        System.out.println("我以后会找工作--》成为 码农 程序员 程序猿 程序媛");
    }
}
