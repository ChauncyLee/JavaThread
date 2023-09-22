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
                    break;
                } else {
                    // 判断桌子上是否有食物
                    if (Desk.foodFlag == 1) {
                        // 如果有，就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        // 如果没有，就制作食物
                        System.out.println("厨师正在制作食物，还能制作" + Desk.count + "份");
                        // 修改桌子上的食物状态
                        Desk.foodFlag = 1;
                        // 叫醒等待的消费者开吃
                        Desk.lock.notifyAll();
                    }
                }
            }
        }

    }
}
