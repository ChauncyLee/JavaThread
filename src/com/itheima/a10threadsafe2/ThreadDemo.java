package com.itheima.a10threadsafe2;

import com.itheima.a09threadsafe1.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
            需求：
                某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
                利用同步方法完成
                技巧：先写同步代码块
         */

        // 创建线程参数对象
        MyRunnable mr = new MyRunnable();

        // 创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
