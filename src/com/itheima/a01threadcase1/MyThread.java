package com.itheima.a01threadcase1;

public class MyThread extends Thread {
    @Override
    public void run() {
        // 重写run方法
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "子线程: " + i);
        }
    }
}
