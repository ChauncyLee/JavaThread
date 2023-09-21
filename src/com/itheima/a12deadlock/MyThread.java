package com.itheima.a12deadlock;

public class MyThread extends Thread{

    static Object objA = new Object();
    static Object objB = new Object();

    @Override
    public void run(){
        //1.循环
        while (true) {
            if ("线程A".equals(getName())) {
                synchronized (objA) {
                    System.out.println("线程A获取到了objA锁,准备拿B锁");
                    synchronized (objB) {
                        System.out.println("线程A获取到了objB锁，顺利执行完一轮");
                    }
                }
            } else if ("线程B".equals(getName())) { //2.判断线程名
                if ("线程B".equals(getName())) {
                    synchronized (objB) {
                        System.out.println("线程B获取到了objB锁，准备拿A锁");
                        synchronized (objA) {
                            System.out.println("线程B获取到了objA锁，顺利执行完一轮");
                        }
                    }
                }

            }
        }
    }


}
