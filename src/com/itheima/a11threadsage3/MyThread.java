package com.itheima.a11threadsage3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int ticket = 0;

    static Lock lock = new ReentrantLock();

    @Override
    public void run(){
        while (true) {
            lock.lock();
                if(ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket++;
                } else {
                    break;
                }
            lock.unlock();
        }
    }
}
