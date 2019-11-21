package com.shengsiyuan.concurrency3;

public class MyTest1 {
    private Object object = new Object();

    public void method(){
        synchronized (object){
            System.out.println("hello world");
        }
        throw new RuntimeException();
    }

    public void method2(){
        synchronized (object){
            System.out.println("welcome");
        }
    }
}
