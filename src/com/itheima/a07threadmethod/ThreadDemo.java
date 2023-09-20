package com.itheima.a07threadmethod;


import com.itheima.a06threadmethod.MyThead1;
import com.itheima.a06threadmethod.MyThead2;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        /*
        public static void yield()：暂停当前正在执行的线程对象，并执行其他线程。 出让线程/礼让线程

         */

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("飞机");
        t2.setName("高铁");

        t1.start();
        t2.start();

    }
}
