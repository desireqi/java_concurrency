package com.shengsiyuan.concurrency1;

/*
   在调用wait()方法时，线程必须持有锁，在调用wait()方法后，线程就会释放该对象的锁
   在调用Thread类的sleep方法时，线程是不会释放对象的锁
 */
public class MyTest1 {

    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        synchronized (object){
            object.wait();

        }
    }
}
