package com.itheima.a11threadsage3;

public class ThreadDemo {

    public static void main(String[] args) {
        // 创建线程对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }

}
