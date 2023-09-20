package com.itheima.a05threadmethod;


import com.itheima.a04threadmethod.MyThread;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        /*
        setPriority(int newPriority)：更改线程的优先级。
        final int getPriority()：返回此线程的优先级。
         */

        // 创建线程要执行的参数对象
        MyRunnable mr = new MyRunnable();

        // 创建线程对象
        Thread t1 = new Thread(mr, "飞机");
        Thread t2 = new Thread(mr, "高铁");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(10);
        t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
    }
}
