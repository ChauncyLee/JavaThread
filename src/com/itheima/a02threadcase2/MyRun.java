package com.itheima.a02threadcase2;

public class MyRun implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 100; i++) {
            // 获取当前线程的名字
            System.out.println(name + " : " + i);
        }
    }
}
