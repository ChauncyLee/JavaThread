package com.itheima.a13waitandnotify;

public class Foodie extends Thread {

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
                if (Desk.count == 0) {
                    break;
                } else {
                    // 先判断桌子上是否有面条
                    if (Desk.foodFlag == 0 ){
                        // 如果没有面条，就等待
                        try {
                            Desk.lock.wait(); // 让当前线程跟锁绑定，以后唤醒的时候，也是根据锁来唤醒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 把吃的总数-1
                        Desk.count--;
                        // 如果有面条，就吃面条
                        System.out.println("吃货在吃面条，还能再吃" + Desk.count + "碗！！！");
                        // 吃完面条，唤醒厨师继续做面条；唤醒绑定在这把锁上的所有线程
                        Desk.lock.notifyAll();
                        // 修改桌子的状态
                        Desk.foodFlag = 0;
                    }
                    // 如果没有面条，就等待
                    // 如果有面条，就吃面条
                    // 吃完面条，唤醒厨师继续做面条
                    // 把吃的总数-1
                    // 修改桌子的状态

                }
            }
        }

    }
}
