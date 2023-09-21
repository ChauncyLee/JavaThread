package com.itheima.a13waitandnotify;

public class Cook extends Thread {

    @Override
    public void run(){
        /**
         * 1. 循环
         * 2. 同步代码块
         * 3. 判断共享数据是否到了末尾（先判断到了末尾，容易）
         * 4. 判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
         */
        while (true) {
            synchronized (Desk.lock) {
                // 结束条件 判断还能吃多少面条
                if (Desk.count == 0) {

                }
            }
        }

    }
}
