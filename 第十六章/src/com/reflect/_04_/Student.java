package com.reflect._04_;

/**
 * @author ty.wang
 * @since 2022/10/30 22:03
 */
@MyAnnotation(value = "hello")
public class Student extends Person implements MyInterface {
    //属性
    private int sno;
    double height;
    protected double weight;
    public double score;
    //构造器

    public Student() {
    }

    public Student(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    private Student(int sno) {
        this.sno = sno;
    }

    Student(int sno, double weight) {
        this.sno = sno;
        this.weight = weight;
    }
    protected Student(int sno, double weight, double height){
        this.sno = sno;
        this.weight = weight;
        this.height = height;
    }
    //方法
    @MyAnnotation("hi method")
    public String showInfo() {
        return "我是一名三好学生";
    }

    public String showInfo(int a) {
        return "重载方法 我是一名三好学生";
    }

    public void work() {
        System.out.println("我以后会找工作--》成为 码农 程序员 程序猿 程序媛");
    }

    void happy() {
        System.out.println("做人最重要的就是开心每一天");
    }

    protected int getSno() {
        return sno;
    }

    @MyAnnotation(value = "hello myMethod")
    @Override
    public void myMethod() {
        System.out.println("我重写了myMethod方法");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", height=" + height +
                ", weight=" + weight +
                ", score=" + score +
                '}';
    }
}
